package service;

import model.Player;
import model.Team;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TransferService {
    CurrencyService currencyService = new CurrencyService();


    public void makeTransfer(Player player, Team toTeam) {

        if (toTeam.getBudget().multiply(BigDecimal.valueOf(toTeam.getCurrency().getExchangeRate()))
                .compareTo(player.getValue().multiply(BigDecimal.valueOf(player.getCurrency().getExchangeRate()))) >= 0) {
            Team fromTeam = player.getTeamList().get(player.getTeamList().size() - 1); //get fromTeam
            System.out.println("transfer can be done");
            if (player.getCurrency() != toTeam.getCurrency()) {
                toTeam.setBudget(toTeam.getBudget()
                        .subtract(currencyService.makeExchange(toTeam.getCurrency(), player.getCurrency(), player.getValue())));
            } else {
                toTeam.setBudget(toTeam.getBudget().subtract(player.getValue()));
            }


            if (player.getCurrency() != fromTeam.getCurrency()) {
                fromTeam.setBudget(fromTeam.getBudget()
                        .add(currencyService.makeExchange(fromTeam.getCurrency(), player.getCurrency(), player.getValue())));
            } else {
                fromTeam.setBudget(fromTeam.getBudget().add(player.getValue()));
            }
            player.getTeamList().add(toTeam);
            addToTransferHistory(toTeam, player);
        } else {
            System.err.println("transfer can not be done because of not enough budget");
        }
    }

    public void addToTransferHistory(Team team, Player player) {
        if (player.getTransferHistory() != null) {
            player.getTransferHistory().add(team);
        } else {
            ArrayList<Team> tempTeam = new ArrayList<>();
            tempTeam.add(team);
            player.setTransferHistory(tempTeam);
        }
    }
}

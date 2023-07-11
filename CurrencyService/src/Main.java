import model.AwardCategoryEnum;
import model.AwardTypeEnum;
import model.Player;
import model.Team;
import service.CurrencyService;
import service.PlayerService;
import service.TeamService;
import service.TransferService;

import java.math.BigDecimal;

public class Main {

    //currency dolar,euro, tl

    public static void main(String[] args) {

        TeamService teamService = new TeamService();
        PlayerService playerService = new PlayerService();
        TransferService transferService = new TransferService();
        CurrencyService currencyService = new CurrencyService();

        Team team = teamService.createTeam("Galatasaray", "GS", "yellow-red",
                "Okan Buruk", "Dursun Özbek", "Nef Arena", new BigDecimal(5000),
                currencyService.getCurrencyByName("EUR"), "Türkiye");

        System.out.println(team.toString());
        teamService.addAwardToTeam(team, "Champions Cup", 2023,
                AwardTypeEnum.CUP, AwardCategoryEnum.INTERNATIONAL);

        System.out.println(team.toString());

        Team team2 = teamService.createTeam("Fenerbahçe", "FB", "yellow-blue",
                "İsmail Kartal", "Ali Koç", "Kadıköy", new BigDecimal(5000),
                currencyService.getCurrencyByName("USD"), "Türkiye");


        teamService.addAwardToTeam(team2, "Turkish Cup", 2023,
                AwardTypeEnum.CUP, AwardCategoryEnum.NATIONAL);

        teamService.addAwardToTeam(team, "League Cup", 2023,
                AwardTypeEnum.CUP, AwardCategoryEnum.NATIONAL);

        System.out.println(team.toString());

        Player player = playerService.createPlayer("Cristiano", "Ronaldo",
                7, 1985, "Forvet", new BigDecimal(1000));
        player.setCurrency(currencyService.getCurrencyByName("USD"));


        playerService.addTeamToPlayer(player, team);
        System.out.println(player.toString());
        transferService.makeTransfer(player, team2);
        System.out.println(team);
        System.out.println(team2);
        System.out.println(player);

    }
}
package com.epam.training.sportsbetting;

public class SportsBettingServiceTest {
    /*private SportsBettingService underTest;

    @Before
    public void setUp() {
        underTest = new SportsBettingService();
    }

    @Test
    public void testFindPlayerShouldGetBackThePlayerWhenFindId() {
        //GIVEN
        Player player = new Player("", "", "", BigDecimal.ONE, LocalDateTime.now(), Currency.HUF);
        underTest.savePlayer(player);

        //WHEN
        Player result = underTest.findPlayerByAccountNumber(0);

        //THEN
        Assert.assertEquals(player, result);
    }

    @Test
    public void testFindPlayerShouldGetBackNullWhenCantFindPlayerById() {
        //GIVEN

        //WHEN
        Player result = underTest.findPlayerByAccountNumber(10);

        //THEN
        Assert.assertEquals(null, result);
    }

    @Test
    public void testSavePlayerShouldAddPlayerToPlayersList() {
        //GIVEN
        Player player = new Player("", "", "", BigDecimal.ONE, LocalDateTime.now(), Currency.HUF);
        underTest.savePlayer(player);

        //WHEN
        int actualSize = underTest.getPlayers().size();

        //THEN
        Assert.assertEquals("Incorrect collection size ", 1, actualSize);
    }

    @Test
    public void testCalculateResultsShouldSetPlayerBalanceWhenWinIsTrue() {
        //GIVEN
        BigDecimal amount = new BigDecimal(1000);
        BigDecimal outcomeOddAmount = new BigDecimal(2);
        BigDecimal wagerAmmount = new BigDecimal(500);
        BigDecimal result;
        BigDecimal expected;
        Player player = new Player(null, null, null, amount, null, null);
        OutcomeOdd outcomeOdd = new OutcomeOdd(outcomeOddAmount, null, null, null);
        Wager wager = new Wager(wagerAmmount, player, outcomeOdd);
        wager.setWin(true);
        underTest.savePlayer(player);
        underTest.saveWager(wager);

        //WHEN
        underTest.calculateResults();
        result = player.getBalance();
        expected = new BigDecimal(2000);

        //THEN
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testCalculateResultsShouldSetPlayerBalanceWhenWinIsFalse() {
        //GIVEN
        BigDecimal amount = new BigDecimal(1000);
        BigDecimal outcomeOddAmount = new BigDecimal(2);
        BigDecimal wagerAmmount = new BigDecimal(500);
        BigDecimal result;
        BigDecimal expected;
        Player player = new Player(null, null, null, amount, null, null);
        OutcomeOdd outcomeOdd = new OutcomeOdd(outcomeOddAmount, null, null, null);
        Wager wager = new Wager(wagerAmmount, player, outcomeOdd);
        wager.setWin(false);
        underTest.savePlayer(player);
        underTest.saveWager(wager);

        //WHEN
        underTest.calculateResults();
        result = player.getBalance();
        expected = new BigDecimal(1000);

        //THEN
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testselectOutcomeOddShouldGetBackOutcomeOddWhenExistsOnIndex() {
        List<SportEvent> sportEvents = underTest.getSportEvents();
        List<List<OutcomeOdd>> outcomeOdds = underTest.getOutcomeOdds();
        int size = outcomeOdds.size();

        OutcomeOdd resultFirst = underTest.selectOutcomeOdd(sportEvents, size - 1);
        OutcomeOdd expectedFirst = outcomeOdds.get(0).get(0);
        OutcomeOdd resultSecond = underTest.selectOutcomeOdd(sportEvents, size);
        OutcomeOdd expectedSecond = outcomeOdds.get(1).get(0);

        Assert.assertEquals(expectedFirst, resultFirst);
        Assert.assertEquals(expectedSecond, resultSecond);
    }

    @Test
    public void testselectOutcomeOddShouldGetNullWhenOutcomeOddNotExistsOnIndex() {
        List<SportEvent> sportEvents = underTest.getSportEvents();

        OutcomeOdd resultFirst = underTest.selectOutcomeOdd(sportEvents, 3);
        OutcomeOdd expectedFirst = null;
        OutcomeOdd resultSecond = underTest.selectOutcomeOdd(sportEvents, 4);
        OutcomeOdd expectedSecond = null;

        Assert.assertEquals(expectedFirst, resultFirst);
        Assert.assertEquals(expectedSecond, resultSecond);
    }*/
}

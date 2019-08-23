package com.epam.training.sportsbetting;

public class IOTest {
    /*private IO underTest;
    private SportsBettingService sbs;

    @Before
    public void setUp() {
        underTest = new IO();
        sbs = new SportsBettingService();
    }

    @Test
    public void testPrintWelcomeMessageShouldWriteOutPlayerName() {
        BigDecimal amount = new BigDecimal(1000);
        Player player = new Player("Béla", null, null, amount, null, Currency.HUF);

        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        underTest.printWelcomeMessage(player);
        verify(out).println(eq("Welcome " + player.getName()));
    }

    @Test
    public void testPrintBalanceShouldWriteOutPlayerBalance() {
        BigDecimal amount = new BigDecimal(1000);
        Player player = new Player("Béla", null, null, amount, null, Currency.HUF);

        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        underTest.printBalance(player);
        verify(out).println(eq("Your balance is " + player.getBalance() + " " + player.getCurrency().toString()));
    }

    @Test
    public void testReadWagerShouldReadAmountFromIO() {
        BigDecimal expected = new BigDecimal(100);
        Assert.assertEquals(expected, underTest.readWagerAmount());
    }

    @Test
    public void testPrintNotEnoughBalance() {
        BigDecimal amount = new BigDecimal(100);
        Player player = new Player("Béla", null, null, amount, null, Currency.HUF);

        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        underTest.printNotEnoughBalance(player);
        verify(out).println(eq("You dont have enough money, your balace is " + player.getBalance() + " " + player.getCurrency().toString()));
    }

    @Test
    public void testReadPlayerDataShouldMakeNewPlayerWithGivenData() {
        BigDecimal amount = new BigDecimal(100);
        Player player = underTest.readPlayerData();

        Assert.assertEquals("Béla", player.getName());
        Assert.assertEquals(amount, player.getBalance());
    }

    @Test
    public void testPrintOutcomeOddsShouldPrintOutEvents() {
        List<SportEvent> sportEvents = sbs.getSportEvents();
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        underTest.printOutcomeOdds(sportEvents);
        verify(out).println(startsWith("What are you want to bet on?"));
    }

    @Test
    public void testPrintWagerSaved() {
        BigDecimal outcomeOddAmount = new BigDecimal(2);
        BigDecimal wagerAmmount = new BigDecimal(500);
        SportEvent sportEvent = new FootballSportEvent.Builder().withTitle("test").build();
        Bet bet = new Bet("test", sportEvent, null);
        Outcome outcome = new Outcome("test", bet);
        OutcomeOdd outcomeOdd = new OutcomeOdd(outcomeOddAmount, null, null, outcome);
        Wager wager = new Wager(wagerAmmount, null, outcomeOdd);
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        underTest.printWagerSaved(wager);
        verify(out).println(startsWith("Wager:"));
    }*/
}

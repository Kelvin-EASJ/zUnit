public class TestClass extends TestSuite {
    @Override
    protected void testlist() {
        testEqualIntsPassesAssertion();
        testDifferentIntsFailsAssertion();
        testCaseSensitiveAssertion();
        testEqualsAssertion();
    }

    public void testEqualIntsPassesAssertion() {
        int result = 5;
        assertEquals(5, result);

    }
    public void testDifferentIntsFailsAssertion() {
        assertEquals(3,7);

    }
    public void testCaseSensitiveAssertion() {
        caseSensitiveAssertion("Flash", "aah");
    }
    public void testEqualsAssertion() {
        equalsAssertion("dance", "baby");
    }
}

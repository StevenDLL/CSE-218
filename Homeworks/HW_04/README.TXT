Big O Time Complexities:

public void generateList() ->
    As a whole this method is O(n^2). The reason for this is because the outer for loop is O(n), then the find() method is called which is also O(n) making this O(n^2).

public String generateCustomSentenceFromList(String keyword, int length) ->
    As a whole this method is O(n). The for loop inside of it is O(1) but since this method calls the find() method it is O(n).

private String[] getDataAsArray(String mainString) ->
    This is O(n) simply because it just calls the String .split() method which by itself is O(n).

public static int find(LinkedList<Link> linkedList, String key) ->
    As a whole this find method is O(n) but the inner for loop is O(1) and the if statement inside of that is O(n).
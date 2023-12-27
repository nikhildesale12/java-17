public static int getLength(Object obj) {
    return switch (obj) {
        case String s -> s.length(); // variable pattern
        case List list && !list.isEmpty() -> list.size(); // type pattern
        case null -> 0;
        default -> -1;
    };
}
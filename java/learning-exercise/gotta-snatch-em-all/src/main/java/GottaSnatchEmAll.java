import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(Objects.requireNonNull(cards, "Cards must not be null"));
    }

    static boolean addCard(String card, Set<String> collection) {
        Objects.requireNonNull(card, "Card must not be null");
        Objects.requireNonNull(collection, "Collection must not be null");
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Objects.requireNonNull(myCollection, "Collection must not be null");
        Objects.requireNonNull(theirCollection, "Collection must not be null");

        return  !myCollection.isEmpty()
                && !theirCollection.isEmpty()
                && !(myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection));
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections == null || collections.isEmpty()) {
            return Collections.emptySet();
        }

        Set<String> commonCards = new HashSet<>(collections.getFirst());

        for (Set<String> collection : collections) {
            commonCards.retainAll(collection);
        }

        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        if (collections == null || collections.isEmpty()) {
            return Collections.emptySet();
        }

        Set<String> allCards = new HashSet<>(collections.getFirst());

        for (Set<String> collection : collections) {
            allCards.addAll(collection);
        }

        return allCards;
    }
}

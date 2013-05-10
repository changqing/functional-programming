Object-Oriented Sets
====================

For this part, you will earn credit by completing the `TweetSet.scala` file. This file defines an abstract class TweetSet with two concrete subclasses, `Empty` which represents an empty set, and `NonEmpty(elem: Tweet, left: TweetSet, right: TweetSet)`, which represents a non-empty set as a binary tree rooted at elem. The tweets are indexed by their text bodies: the bodies of all tweets on the left are lexicographically smaller than elem and all bodies of elements on the right are lexicographically greater.

Note also that these classes are immutable: the `set-theoretic` operations do not modify this but should return a new set.

Before tackling this assignment, we suggest you first study the already implemented methods `contains` and `incl` for inspiration.
1. Filtering   

2. Taking Unions

3. Sorting Tweets by Their Influence

4. Tying everything together

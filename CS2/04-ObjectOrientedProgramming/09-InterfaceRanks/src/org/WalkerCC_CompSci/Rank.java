package org.WalkerCC_CompSci;

import java.util.Objects;

public class Rank implements Comparable<Rank>{
    private Title rankTitle;

    public Rank(Title rankTitle){
        this.rankTitle = rankTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rank rank = (Rank) o;
        return rankTitle == rank.rankTitle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rankTitle);
    }

    @Override
    public int compareTo(Rank rank) {
       int thisRank;
       int otherRank;

        thisRank = RankNumber(this.rankTitle);
        otherRank = RankNumber(rank.rankTitle);

        return thisRank - otherRank;


    }

    private int RankNumber(Title title) {
        if(title == Title.GENERAL){
            return 4;
        }
        else if(title == Title.CAPTAIN){
            return 3;
        }
        else if(title == Title.SERGEANT){
            return 2;
        }
        else{
            return 1;
        }
    }
}

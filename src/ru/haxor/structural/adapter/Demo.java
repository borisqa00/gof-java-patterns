package ru.haxor.structural.adapter;

import ru.haxor.structural.adapter.adapters.SquarePegAdapter;
import ru.haxor.structural.adapter.round.RoundHole;
import ru.haxor.structural.adapter.round.RoundPeg;
import ru.haxor.structural.adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fits(rpeg)) {
            System.out.println("Round peg fits the hole");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Small square fits");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Large square doesnt fit");
        }

    }
}

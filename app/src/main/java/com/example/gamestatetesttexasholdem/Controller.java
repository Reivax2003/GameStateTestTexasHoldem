package com.example.gamestatetesttexasholdem;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Controller implements View.OnClickListener {

    private TextView text; //text displayed on screen

    public Controller(TextView text) {
        this.text = text;
    }

    //clear text
    @Override
    public void onClick(View view) {
        text.setText("");
        ArrayList<Player> players = new ArrayList<Player>();

        //set up players
        Player p1 = new Player("Joe", 1000);
        players.add(p1);
        Player p2 = new Player("Mary", 2000);
        players.add(p2);
        Player p3 = new Player("Bill", 3000);
        players.add(p3);


        PokerGameState firstInstance = new PokerGameState(players, 30, 100);
        PokerGameState firstCopy = new PokerGameState(firstInstance);

        firstInstance.fold(p1); //joe folds
        firstInstance.playerTurn++;//have to update turn
        text.append("Player 1 (Joe) folds \n");

        firstInstance.bet(p2, 200); //mary bets 200
        firstInstance.playerTurn++;
        text.append("Player 2 (Mary) bets 200 \n");

        firstInstance.bet(p3, 300); //bill bets 300, raising by 100
        firstInstance.playerTurn++;
        text.append("Player 3 (Bill) bets 300 \n");

        PokerGameState secondInstance = new PokerGameState(players, 30, 100);
        PokerGameState secondCopy = new PokerGameState(secondInstance);

        if (firstCopy.toString().equals(secondCopy.toString())) { //check if copies are the same
            text.append("firstCopy and secondCopy are identical");
        } else {
            text.append("firstCopy and secondCopy are NOT identical");
        }

        text.append(firstCopy.toString());
        text.append(secondCopy.toString());
    }
}

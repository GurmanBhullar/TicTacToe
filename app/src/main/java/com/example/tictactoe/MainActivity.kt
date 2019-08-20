package com.example.tictactoe

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.CellIdentity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
     fun buclick(View:View){
        val buselected=View as Button
        var  CellId=0
        when(buselected.id)
        {
            R.id.bu1->CellId=1
            R.id.bu2->CellId=2
            R.id.bu3->CellId=3
            R.id.bu4->CellId=4
            R.id.bu5->CellId=5
            R.id.bu6->CellId=6
            R.id.bu7->CellId=7
            R.id.bu8->CellId=8
            R.id.bu9->CellId=9


        }
    //    Toast.makeText(this,"ID:"+CellId, Toast.LENGTH_LONG).show()
playgame(CellId,buselected)

    }
    var player1=ArrayList<Int>()
    var player2=ArrayList<Int>()
    var activeplayer=1
    fun playgame(CellID:Int,buselected:Button)
    {
        if(activeplayer==1)
        {
            buselected.text="X"
            buselected.setBackgroundColor(Color.BLUE)
            player1.add(CellID)
            activeplayer=2
        }
        else
        {

            buselected.text="O"
            buselected.setBackgroundColor(Color.GRAY)
            player2.add(CellID)
            activeplayer=1
        }
        buselected.isEnabled=false
        checkwin()

    }
    fun checkwin()
    {
        var winner=-1

            if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
                winner = 1
            }
            if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
                winner = 1
            }
            if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
                winner = 1
            }
            if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
                winner = 1
            }
            if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
                winner = 1
            }
            if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
                winner = 1
            }
            if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
                winner = 1
            }
            if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
                winner = 1
            }

            if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
                winner = 2
            }
            if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
                winner = 2
            }
            if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
                winner = 2
            }
            if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
                winner = 2
            }
            if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
                winner = 2
            }
            if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
                winner = 2
            }
            if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
                winner = 2
            }
            if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
                winner = 2
            }

            if(winner!=-1)
            {
                Toast.makeText(this,"Player $winner wins", Toast.LENGTH_LONG).show()
            }


        }
    }


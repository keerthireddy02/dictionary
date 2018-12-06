package com.example.keerthi.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class wordacivity extends AppCompatActivity {
    private int value;
    private TextView example,meaning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordacivity);
        Intent intent=getIntent();
        int value=intent.getIntExtra("value",0);

        example=findViewById(R.id.example);
        meaning=findViewById(R.id.meaning);

        if(value==0){
            example.setText("i considered him");
            meaning.setText("deem to be");
        }
        else if(value==1){
            example.setText("minute stain");
            meaning.setText("infinitely small");
        }
        else if(value==2){
            example.setText("The committee worked in accord on the bill, and it eventually passed.");
            meaning.setText("concurrence of opinion");
        }
        else if(value==3){
            example.setText("That confidence was certainly evident in the way Smith handled the winning play with 14 seconds left on the clock.");
            meaning.setText("clearly revealed to the mind or the senses or judgment");
        }
        else if(value==4){
            example.setText("He directed and acted in plays every season and became known for exploring Elizabethan theatre practices.");
            meaning.setText("a customary way of operation or behavior");
        }
        else if(value==5){
            example.setText("“Lipstick, as a product intended for topical use with limited absorption, is ingested only in very small quantities,” the agency said on its website.");
            meaning.setText("have in mind as a purpose");
        }
        else if(value==6){
            example.setText("The scandal broke out in October after former chief executive Michael Woodford claimed he was fired for raising concerns about the company's accounting practices.");
            meaning.setText("something that interests you because it is important");
        }
        else if(value==7){
            example.setText("In an unprecedented front page article in 2003 The Times reported that Mr. Blair, a young reporter on its staff, had committed journalistic fraud.");
            meaning.setText("perform an act, usually with a negative connotation");
        }
        else if(value==8){
            example.setText("As a result, the privacy issues surrounding mobile computing are becoming ever-more complex.");
            meaning.setText("some situation or event that is thought about");
        }
        else if(value==9){
            example.setText("Spain’s jobless rate for people ages 16 to 24 is approaching 50 percent.");
            meaning.setText("move towards");
        }
        else if(value==10){
            example.setText("A small French colony, Port Louis, was established on East Falkland in 1764 and handed to the Spanish three years later.");
            meaning.setText("set up or found");
        }
        else if(value==11){
            example.setText("No one can blame an honest mechanic for holding a wealthy snob in utter contempt.");
            meaning.setText("without qualification");
        }
        else if(value==12){
            example.setText("Scientists have been conducting studies of individual genes for years.");
            meaning.setText("direct the course of; manage or control");
        }
        else if(value==13){
            example.setText("who were seated about on the sofas, reading, or playing games, or engaged in conversation.");
            meaning.setText("consume all of one's attention or time");
        }
        else if(value==14){
            example.setText("Stone magazine obtained the report and posted it Friday night.");
            meaning.setText("come into possession of");
        }
        else if(value==15){
            example.setText("heating oil could grow more scarce in the Northeast this winter");
            meaning.setText("deficient in quantity or number compared with the demand");
        }
        else if(value==16){
            example.setText("Inflation has lagged behind the central bank’s 2 percent target, giving policy makers extra scope to cut rates.");
            meaning.setText("a plan of action adopted by an individual or social group");
        }
        else if(value==17){
            example.setText("After three straight losing seasons, Hoosiers fans were just hoping for a winning record.");
            meaning.setText("successive, without a break");
        }
        else if(value==18){
            example.setText("In other words, Apple’s stock is cheap, and you should buy it");
            meaning.setText("capital raised by a corporation through the issue of shares");
        }
        else if(value==19){
            example.setText("But the elderly creak is beginning to become apparent in McCartney’s voice.");
            meaning.setText("clearly revealed to the mind or the senses or judgment");
        }

    }
}

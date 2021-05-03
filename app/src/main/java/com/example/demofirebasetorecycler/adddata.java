package com.example.demofirebasetorecycler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class adddata extends AppCompatActivity
{
   EditText producent,gatunek,nazwa_towaru,odmiana, kolor_EN,grupa_EN, podgrupa_EN,szacowany_plon,obecność_off,procent_off,opis,plantacja_typowa,uwagi,
           partia,nr_reprodukcji,id_plantacji,komentarz_po_polsku,opis_po_polsku,symbol,purl;
   Button submit,back;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddata);

        producent=(EditText)findViewById(R.id.add_producent);
        nazwa_towaru=(EditText)findViewById(R.id.add_nazwa_towaru);
        gatunek=(EditText)findViewById(R.id.add_gatunek);
        odmiana=(EditText)findViewById(R.id.add_odmiana);
        kolor_EN=(EditText)findViewById(R.id.add_kolor_EN);
        grupa_EN=(EditText)findViewById(R.id.add_grupa_EN);
        podgrupa_EN=(EditText)findViewById(R.id.add_podgrupa_EN);
        szacowany_plon=(EditText)findViewById(R.id.add_szacowany_plon);
        obecność_off=(EditText)findViewById(R.id.add_obecność_off);
        procent_off=(EditText)findViewById(R.id.add_procent_off);
        opis=(EditText)findViewById(R.id.add_opis);
        plantacja_typowa=(EditText)findViewById(R.id.add_plantacja_typowa);
        uwagi=(EditText)findViewById(R.id.add_uwagi);
        partia=(EditText)findViewById(R.id.add_partia);
        nr_reprodukcji=(EditText)findViewById(R.id.add_nr_reprodukcji);
        id_plantacji=(EditText)findViewById(R.id.add_id_plantacji);
        komentarz_po_polsku=(EditText)findViewById(R.id.add_komentarz_po_polsku);
        opis_po_polsku=(EditText)findViewById(R.id.add_opis_po_polsku);
        symbol=(EditText)findViewById(R.id.add_symbol);
        purl=(EditText)findViewById(R.id.add_purl);

        back=(Button)findViewById(R.id.add_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        });

        submit=(Button)findViewById(R.id.add_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processinsert();
            }
        });
    }

    private void processinsert()
    {
        Map<String,Object> map=new HashMap<>();
        map.put("producent",producent.getText().toString());
        map.put("gatunek",gatunek.getText().toString());
        map.put("nazwa_towaru",nazwa_towaru.getText().toString());
        map.put("odmiana",odmiana.getText().toString());
        map.put("kolor_EN",kolor_EN.getText().toString());
        map.put("grupa_EN",grupa_EN.getText().toString());
        map.put("podgrupa_EN",podgrupa_EN.getText().toString());
        map.put("szacowany_plon",szacowany_plon.getText().toString());
        map.put("obecność_off",obecność_off.getText().toString());
        map.put("procent_off",procent_off.getText().toString());
        map.put("opis",opis.getText().toString());
        map.put("plantacja_typowa",plantacja_typowa.getText().toString());
        map.put("uwagi",uwagi.getText().toString());
        map.put("partia",partia.getText().toString());
        map.put("nr_reprodukcji",nr_reprodukcji.getText().toString());
        map.put("id_plantacji",id_plantacji.getText().toString());
        map.put("komentarz_po_polsku",komentarz_po_polsku.getText().toString());
        map.put("opis_po_polsku",opis_po_polsku.getText().toString());
        map.put("symbol",symbol.getText().toString());
        map.put("purl",purl.getText().toString());
        FirebaseDatabase.getInstance().getReference().child("LegutkoChiny").push()
                .setValue(map)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                       producent.setText("");
                       gatunek.setText("");
                       nazwa_towaru.setText("");
                        odmiana.setText("");
                        kolor_EN.setText("");
                        grupa_EN.setText("");
                        podgrupa_EN.setText("");
                        szacowany_plon.setText("");
                        obecność_off.setText("");
                        procent_off.setText("");
                        opis.setText("");
                        plantacja_typowa.setText("");
                        uwagi.setText("");
                        partia.setText("");
                        id_plantacji.setText("");
                        komentarz_po_polsku.setText("");
                        opis_po_polsku.setText("");
                        symbol.setText("");
                       purl.setText("");
                        Toast.makeText(getApplicationContext(),"Inserted Successfully",Toast.LENGTH_LONG).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e)
                    {
                        Toast.makeText(getApplicationContext(),"Could not insert",Toast.LENGTH_LONG).show();
                    }
                });

    }
}
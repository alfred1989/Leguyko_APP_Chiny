package com.example.demofirebasetorecycler;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;
import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.DialogPlusBuilder;
import com.orhanobut.dialogplus.ViewHolder;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Handler;

import de.hdodenhof.circleimageview.CircleImageView;


public class myadapter extends FirebaseRecyclerAdapter<model,myadapter.myviewholder>
{
    public myadapter(@NonNull FirebaseRecyclerOptions<model> options)
    {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull final myviewholder holder, final int position, @NonNull final model model)
    {

        holder.plantacja_typowa.setText(model.getPlantacja_typowa());
        String plantacja_typowa_Kolor =  model.getPlantacja_typowa();
        if(plantacja_typowa_Kolor.equals("Incorrect") || plantacja_typowa_Kolor.equals("Nietypowa"))
        {holder.test.setBackgroundColor(Color.parseColor("#000000"));
            holder.producent.setTextColor(Color.parseColor("#DC143C"));
            holder.gatunek_lac.setTextColor(Color.parseColor("#DC143C"));
            holder.nazwa_towaru.setTextColor(Color.parseColor("#DC143C"));
            holder.nr_reprodukcji.setTextColor(Color.parseColor("#DC143C"));
            holder.partia.setTextColor(Color.parseColor("#DC143C"));
            holder.plantacja_typowa.setTextColor(Color.parseColor("#DC143C"));
            holder.text_1.setTextColor(Color.parseColor("#DC143C"));
            holder.text_2.setTextColor(Color.parseColor("#DC143C"));
            holder.text_3.setTextColor(Color.parseColor("#DC143C"));
            holder.text_4.setTextColor(Color.parseColor("#DC143C"));
            holder.text_5.setTextColor(Color.parseColor("#DC143C"));
            holder.text_6.setTextColor(Color.parseColor("#DC143C"));
        }
        else{holder.test.setBackgroundColor(Color.parseColor("#000000"));}
        holder.producent.setText(model.getProducent());
        holder.gatunek_lac.setText(model.getGatunek_lac());
        holder.nazwa_towaru.setText(model.getNazwa_towaru());
        holder.nr_reprodukcji.setText(model.getNr_reprodukcji());
        holder.partia.setText(model.getPartia());
        holder.plantacja_typowa.setText(model.getPlantacja_typowa());

        holder.edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final DialogPlus dialogPlus=DialogPlus.newDialog(holder.edit.getContext())
                        .setContentHolder(new ViewHolder(R.layout.dialogcontent))
                        .setExpanded(true,2100)
                        .create();

                View myview=dialogPlus.getHolderView();
                //  final EditText purl=myview.findViewById(R.id.uimgurl);
                final TextView producent=myview.findViewById(R.id.producentUpdata);
                final TextView gatunek=myview.findViewById(R.id.gatunekUpdata);
                final TextView nazwa_towaru=myview.findViewById(R.id.nazwa_towaruUpdata);
                final TextView odmiana=myview.findViewById(R.id.odmianaUpdata);
                final TextView kolor_EN=myview.findViewById(R.id.kolor_EN_Updata);
                final TextView grupa_EN=myview.findViewById(R.id.grupa_EN_Updata);
                final TextView podgrupa_EN=myview.findViewById(R.id.podgrupa_EN_Updata);
                final EditText szacowany_plon=myview.findViewById(R.id.szacowany_plon_Updata);
                final EditText obecność_off=myview.findViewById(R.id.obecność_off_Updata);
                final EditText procent_off=myview.findViewById(R.id.procent_off_Updata);
                final EditText opis=myview.findViewById(R.id.opis_Updata);
                final EditText plantacja_typowa=myview.findViewById(R.id.plantacja_typowa_Updata);
                final EditText uwagi=myview.findViewById(R.id.uwagi_Updata);
                final TextView partia=myview.findViewById(R.id.partia_Updata);
                final TextView nr_reprodukcji=myview.findViewById(R.id.nr_reprodukcji_Updata);
                final TextView id_plantacji=myview.findViewById(R.id.id_plantacji_Updata);
                final TextView symbol=myview.findViewById(R.id.symbol_Updata);
                Button submit=myview.findViewById(R.id.usubmit);

                //   purl.setText(model.getPurl());
                producent.setText(model.getProducent());
                gatunek.setText(model.getGatunek_lac());
                nazwa_towaru.setText(model.getNazwa_towaru());
                odmiana.setText(model.getOdmiana());
                kolor_EN.setText(model.getKolor_EN());
                grupa_EN.setText(model.getGrupa_EN());
                podgrupa_EN.setText(model.getPodgrupa_EN());
                szacowany_plon.setText(model.getSzacowany_plon());
                obecność_off.setText(model.getObecność_off());
                procent_off.setText(model.getProcent_off());
                opis.setText(model.getOpis());
                plantacja_typowa.setText(model.getPlantacja_typowa());
                uwagi.setText(model.getUwagi());
                partia.setText(model.getPartia());
                nr_reprodukcji.setText(model.getNr_reprodukcji());
                //  komentarz_po_polsku.setText(model.getKomentarz_po_polsku());
                id_plantacji.setText(model.getId_plantacji());
                //  opis_po_polsku.setText(model.getOpis_po_polsku());
                symbol.setText(model.getSymbol());

                dialogPlus.show();
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Map<String,Object> map=new HashMap<>();
                        //   map.put("purl",purl.getText().toString());
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
//                                        map.put("komentarz_po_polsku",komentarz_po_polsku.getText().toString());
//                                        map.put("opis_po_polsku",opis_po_polsku.getText().toString());
                        map.put("symbol",symbol.getText().toString());

                        FirebaseDatabase.getInstance().getReference().child("LegutkoChiny")
                                .child(getRef(position).getKey()).updateChildren(map)
                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void aVoid) {
                                        dialogPlus.dismiss();
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        dialogPlus.dismiss();
                                    }
                                });
                    }
                });
//System.out.println(plantacja_typowa+ " plantacja_typowa");

            }
        });


//                    holder.delete.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            AlertDialog.Builder builder=new AlertDialog.Builder(holder.img.getContext());
//                            builder.setTitle("Delete Panel");
//                            builder.setMessage("Delete...?");
//
//                            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialogInterface, int i) {
//                                    FirebaseDatabase.getInstance().getReference().child("students")
//                                            .child(getRef(position).getKey()).removeValue();
//                                }
//                            });
//
//                            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialogInterface, int i) {
//
//                                }
//                            });
//
//                            builder.show();
//                        }
//                    });

    } // End of OnBindViewMethod

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }


    class myviewholder extends RecyclerView.ViewHolder
    {
        CircleImageView img;
        ImageView edit,delete;
        TextView producent,gatunek_lac,nazwa_towaru, odmiana, kolor_EN, grupa_EN, podgrupa_EN,
                szacowany_plon,obecność_off,procent_off, opis,plantacja_typowa,uwagi ,
                nr_reprodukcji, partia,text_0, text_1,text_2,text_3,text_4,text_5,text_6;
        TableLayout test;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            // img=(CircleImageView) itemView.findViewById(R.id.img1);
            text_1=(TextView)itemView.findViewById(R.id.text_1);
            text_2=(TextView)itemView.findViewById(R.id.text_2);
            text_3=(TextView)itemView.findViewById(R.id.text_3);
            text_4=(TextView)itemView.findViewById(R.id.text_4);
            text_5=(TextView)itemView.findViewById(R.id.text_5);
            text_6=(TextView)itemView.findViewById(R.id.text_6);

            producent=(TextView)itemView.findViewById(R.id.producentText);
            gatunek_lac=(TextView)itemView.findViewById(R.id.gatunek_lacText);
            nazwa_towaru=(TextView)itemView.findViewById(R.id.nazwa_towaruText);
            plantacja_typowa=(TextView)itemView.findViewById(R.id.plantacja_typowa_Text);
            uwagi=(TextView)itemView.findViewById(R.id.plantacja_typowa_Text);
            nr_reprodukcji=(TextView)itemView.findViewById(R.id.nr_reprodukcji_Text);
            partia=(TextView)itemView.findViewById(R.id.partia_Text);
            test=(TableLayout) itemView.findViewById(R.id.test);
            edit=(ImageView)itemView.findViewById(R.id.editicon);
            //  delete=(ImageView)itemView.findViewById(R.id.deleteicon);



        }
    }

    //---------------------------CAMERA-------------------------------------------------------------

}

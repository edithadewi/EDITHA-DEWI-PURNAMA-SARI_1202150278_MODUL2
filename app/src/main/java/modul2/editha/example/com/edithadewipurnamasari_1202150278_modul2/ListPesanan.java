package modul2.editha.example.com.edithadewipurnamasari_1202150278_modul2;

/**
 * Created by asus on 17/02/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.widget.TextView;

import java.util.ArrayList;

public class ListPesanan extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataPrice;
    private ArrayList<Integer> foto;
    private TextView x,y;

    //Daftar Menu Makanan
    private String[] Judul = {"Nasi Goreng", "Mojito","Roti Maryam Coklat","Roti Maryam Es Krim","Roti Maryam Keju","Martabak Telur"};
    //Daftar Harga
    private String[] test = {"Rp. 15.000", "Rp. 8000","Rp. 8000","Rp. 15.000","Rp. 10.000","Rp. 25.000"};
    //Daftar Gambar
    private int[] Foto = {R.drawable.nasigoreng, R.drawable.mojito,R.drawable.rotimaryamcoklat,R.drawable.rotimaryameskrim,R.drawable.rotimaryamkeju,
            R.drawable.martabaktelur};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pesanan);


        //mendeklarasikan array list untuk menu, harga dan gambar
        dataMenu = new ArrayList<>();
        dataPrice = new ArrayList<>();
        foto = new ArrayList<>();
        DaftarItem();


        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu,dataPrice,foto);
        rvView.setAdapter(adapter);

    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataPrice.add(test[w]);
            foto.add(Foto[w]);
        }
    }


}

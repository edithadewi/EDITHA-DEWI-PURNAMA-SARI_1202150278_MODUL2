package modul2.editha.example.com.edithadewipurnamasari_1202150278_modul2;

/**
 * Created by editha on 17/02/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {

    private TextView x,y,z;
    private ImageView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        //melakukan insiasi pada id nya

        x = (TextView) findViewById(R.id.namamenu);

        y = (TextView) findViewById(R.id.price);

        z = (TextView) findViewById(R.id.komposisi);

        w = (ImageView) findViewById(R.id.foto);


        //melakukan get data dari menu fitur sebelumnya sudah membawa data yang dikirim
        Intent c = getIntent();

        String menu = c.getStringExtra("judul");
        String price = c.getStringExtra("price");
        String komposisi= c.getStringExtra("komposisi");
        Integer foto = c.getIntExtra("gambar",0);

        //melakukan set tex maupun setImageResource untuk data yang sudah di bawa dari layout sbeelumnya
        x.setText(menu);
        y.setText(price);
        z.setText(komposisi);
        w.setImageResource(foto);


    }
}

package com.example.myapplication;
import com.example.myapplication.Adaptadores.AdapterRecycler;
import com.example.myapplication.Models.*;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class WinZip_UI extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener{

    private RecyclerView recyclerView;
    private AdapterRecycler adapterRecycler;
    DrawerLayout drawerLayout;
    NavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_zip__u_i);

        Toolbar toolbar = (Toolbar) findViewById(R.id.Tool);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.iconmenu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navView = (NavigationView)findViewById(R.id.nav_viewWZ);
        navView.setNavigationItemSelectedListener(this);


        try {
            Clase();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    public void Clase() throws JSONException {
        String myJsonString= "{\n" +
                "   \"data\":[\n" +
                "      {\n" +
                "         \"title\":\"Alarms\",\n" +
                "         \"item\":\"0 items\",\n" +
                "         \"date\":\"2019-12-09\",\n" +
                "         \"hour\":\"17:37\",\n" +
                "         \"img\":\"https://i.ibb.co/p4LhLGk/carpeta.png\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"title\":\"Android\",\n" +
                "         \"item\":\"0 items\",\n" +
                "         \"date\":\"2019-12-09\",\n" +
                "         \"hour\":\"17:37\",\n" +
                "         \"img\":\"https://i.ibb.co/p4LhLGk/carpeta.png\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"title\":\"DCIM\",\n" +
                "         \"item\":\"0 items\",\n" +
                "         \"date\":\"2019-12-09\",\n" +
                "         \"hour\":\"17:37\",\n" +
                "         \"img\":\"https://i.ibb.co/p4LhLGk/carpeta.png\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"title\":\"Download\",\n" +
                "         \"item\":\"0 items\",\n" +
                "         \"date\":\"2019-12-09\",\n" +
                "         \"hour\":\"17:37\",\n" +
                "         \"img\":\"https://i.ibb.co/p4LhLGk/carpeta.png\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"title\":\"MEGA\",\n" +
                "         \"item\":\"0 items\",\n" +
                "         \"date\":\"2019-12-09\",\n" +
                "         \"hour\":\"17:37\",\n" +
                "         \"img\":\"https://i.ibb.co/p4LhLGk/carpeta.png\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"title\":\"Movies\",\n" +
                "         \"item\":\"0 items\",\n" +
                "         \"date\":\"2019-12-09\",\n" +
                "         \"hour\":\"17:37\",\n" +
                "         \"img\":\"https://i.ibb.co/p4LhLGk/carpeta.png\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"title\":\"Pictures\",\n" +
                "         \"item\":\"0 items\",\n" +
                "         \"date\":\"2019-12-09\",\n" +
                "         \"hour\":\"17:37\",\n" +
                "         \"img\":\"https://i.ibb.co/p4LhLGk/carpeta.png\"\n" +
                "      },\n" +
                "     {\n" +
                "         \"title\":\"Tencent\",\n" +
                "         \"item\":\"0 items\",\n" +
                "         \"date\":\"2019-12-09\",\n" +
                "         \"hour\":\"17:37\",\n" +
                "         \"img\":\"https://i.ibb.co/p4LhLGk/carpeta.png\"\n" +
                "      },\n" +
                "     {\n" +
                "         \"title\":\"tmp\",\n" +
                "         \"item\":\"0 items\",\n" +
                "         \"date\":\"2019-12-09\",\n" +
                "         \"hour\":\"17:37\",\n" +
                "         \"img\":\"https://i.ibb.co/p4LhLGk/carpeta.png\"\n" +
                "      },\n" +
                "     {\n" +
                "         \"title\":\"Video\",\n" +
                "         \"item\":\"0 items\",\n" +
                "         \"date\":\"2019-12-09\",\n" +
                "         \"hour\":\"17:37\",\n" +
                "         \"img\":\"https://i.ibb.co/p4LhLGk/carpeta.png\"\n" +
                "      },\n" +
                "     {\n" +
                "         \"title\":\"WhatsApp\",\n" +
                "         \"item\":\"0 items\",\n" +
                "         \"date\":\"2019-12-09\",\n" +
                "         \"hour\":\"17:37\",\n" +
                "         \"img\":\"https://i.ibb.co/p4LhLGk/carpeta.png\"\n" +
                "      },\n" +
                "     {\n" +
                "         \"title\":\"Voice Recorder\",\n" +
                "         \"item\":\"0 items\",\n" +
                "         \"date\":\"2019-12-09\",\n" +
                "         \"hour\":\"17:37\",\n" +
                "         \"img\":\"https://i.ibb.co/p4LhLGk/carpeta.png\"\n" +
                "      }\n" +
                "     \n" +
                "   ]\n" +
                "}";
        JSONObject JSONlista =  new JSONObject();
        JSONlista = new JSONObject(myJsonString);
        JSONArray JSONArray=  JSONlista.getJSONArray("data");
        ArrayList<Datum> data = Datum.JsonObjectsBuild(JSONArray);
        recyclerView=(RecyclerView)findViewById(R.id.Rec_Anuncio);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterRecycler= new AdapterRecycler(data);
        recyclerView.setAdapter(adapterRecycler);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menutoolbar_w_z , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layoutWZ);
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }


}
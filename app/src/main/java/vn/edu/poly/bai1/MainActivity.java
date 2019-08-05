package vn.edu.poly.bai1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
private ListView rvPerson;

    String[] animeName={"Hancock","Shank","One65"};
    String[] animeAge={"18","35","20"};
    int[] animeImages={R.drawable.hancock,R.drawable.shank,R.drawable.one65};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPerson=findViewById(R.id.rvPerson);
        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();

        for (int i = 0; i <animeName.length ; i++) {

            HashMap<String,String> anime=new HashMap<>();
            anime.put("image",animeImages[i]+"");
            anime.put("name",animeName[i]);
            anime.put("age",animeAge[i]);


            arrayList.add(anime);
        }
        String[] from={"image","name","age"};
        int[] to={R.id.imPicture,R.id.tvName,R.id.tvAge};
        SimpleAdapter simpleAdapter=new SimpleAdapter(MainActivity.this,arrayList,R.layout.row,from,to);

        rvPerson.setAdapter(simpleAdapter);

    }
}

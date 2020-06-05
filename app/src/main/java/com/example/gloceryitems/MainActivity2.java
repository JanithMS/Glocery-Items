package com.example.gloceryitems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ListView mListView;
    int[] images = {R.drawable.bakingsoda,
            R.drawable.basmatirice,
            R.drawable.butter,
            R.drawable.carrots,
            R.drawable.dlitecookingoil,
            R.drawable.eggs,
            R.drawable.fruits,
            R.drawable.icecream,
            R.drawable.juice,
            R.drawable.milk,
            R.drawable.onion,
            R.drawable.pizza,
            R.drawable.potatoes,
            R.drawable.sugar,
            R.drawable.yellowmustard};
    String[] Names ={"Baking Soda",
            "Basmati Rice",
            "Butter",
            "Carrots",
            "D'lite Cooking Oil",
            "Eggs",
            "Fruits",
            "Ice Cream",
            "Juice",
            "Milk",
            "Onion",
            "Pizza",
            "Potatoes",
            "Sugar",
            "Yellow Mustard"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mListView = (ListView) findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();
        mListView.setAdapter(customAdapter);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity2.this, Names[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = getLayoutInflater().inflate(R.layout.custtomlayout,null);
            ImageView mImageView = view.findViewById(R.id.imageView);
            mImageView.setImageResource(images[position]);
            return view;
        }
    }
}
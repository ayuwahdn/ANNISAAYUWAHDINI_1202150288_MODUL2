package com.example.android.annisaayuwahdini_1202150288_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {
    private LayoutInflater mInflater;
    private List<Model> menuList;


    public WordListAdapter(Context context, List<Model> menuList){
        mInflater = LayoutInflater.from(context);
        this.menuList = menuList;
    }

        public class WordViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener{

            public TextView name, price;
            ImageView image;

            public WordViewHolder(View view){
                super(view);

                TextView name = (TextView) view.findViewById((R.id.nama));
                TextView price = (TextView) view.findViewById((R.id.pricemeat));
                TextView image = (TextView) view.findViewById((R.id.image));
                view.setOnClickListener(this);
            }


            @Override
            public void onClick(View view) {
                int mPosition = getLayoutPosition();

                String element = menuList.get(mPosition).toString();
                Toast.makeText(view.getContext(), name.getText(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), DetailMenu.class);
                int image = menuList.get(mPosition).getImage();
                int composition = menuList.get(mPosition).getComposition();
                intent.putExtra("image", image);
                intent.putExtra("name", name.getText());
                intent.putExtra("price", price.getText());
                intent.putExtra("composition", composition);
                view.getContext().startActivity(intent);


            }
        }


    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);

        return new WordViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {

        Model model = menuList.get(position);
        holder.image.setImageResource(Model.getImage());

        holder.price.setText(Model.getPrice());
        holder.name.setText(Model.getName());


    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

}

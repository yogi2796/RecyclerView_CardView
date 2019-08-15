package com.example.recyclerview_cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private Context ctx;
    private List<Product> productList;

    public ProductAdapter(Context ctx, List<Product> productList) {
        this.ctx = ctx;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.layout_cardview,null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
            Product product =productList.get(position);

            holder.itemname1.setText(product.getItemname1());
            holder.shortdesc1.setText(product.getShortdesc1());
            holder.rating1.setText(String.valueOf(product.getRating1()));
            holder.price1.setText(String.valueOf(product.getPrice1()));

            holder.imageview1.setImageDrawable(ctx.getResources().getDrawable(product.getImageview1()));
    }

    @Override
    public int getItemCount() {
        return  productList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView itemname1, shortdesc1, rating1, price1;
        ImageView imageview1;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemname1 = itemname1;
            this.shortdesc1 = shortdesc1;
            this.rating1 = rating1;
            this.price1 = price1;
            this.imageview1 = imageview1;
        }






    }
}

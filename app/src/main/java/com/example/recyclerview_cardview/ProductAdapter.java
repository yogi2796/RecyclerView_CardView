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
            Product product = productList.get(position);

            holder.itemname1.setText(product.getTitle());
            holder.shortdesc1.setText(product.getShortdesc());
            holder.rating1.setText(String.valueOf(product.getRating()));
            holder.price1.setText(String.valueOf(product.getPrice()));

            holder.imageview1.setImageDrawable(ctx.getResources().getDrawable(product.getImage()));
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
            this.itemname1 = itemView.findViewById(R.id.textViewTitle);
            this.shortdesc1 = itemView.findViewById(R.id.textViewShortDesc);
            this.rating1 = itemView.findViewById(R.id.textViewRating);
            this.price1 = itemView.findViewById(R.id.textViewPrice);
            this.imageview1 = itemView.findViewById(R.id.imageView);
        }






    }
}

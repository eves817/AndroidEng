package com.example.english5;
import android.content.Context;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    Context context;
    ArrayList<Post> profiles;



    public MyAdapter(Context c, ArrayList<Post> p)
    {
        context=c;
        profiles=p;
    }

    @NonNull
    @Override

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder  holder, int position) {
       // Post post=profiles.get(position);

        holder.KK.setText(profiles.get(position).getKK());
        holder.PartsOfSpeech.setText(profiles.get(position).getPartsOfSpeech());
        holder.VOC.setText(profiles.get(position).getVOC());
        holder.VOC_CN_Explanation.setText(profiles.get(position).getVOC_CN_Explanation());
        holder.VOC_EG_Explanation.setText(profiles.get(position).getVOC_EG_Explanation());
    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView KK,VOC_CN_Explanation,VOC_EG_Explanation,VOC,PartsOfSpeech;

        public MyViewHolder(View itemView){
            super(itemView);
            KK=(TextView) itemView.findViewById(R.id.KK);
            PartsOfSpeech=(TextView) itemView.findViewById(R.id.PartsOfSpeech);
            VOC=(TextView) itemView.findViewById(R.id.VOC);
            VOC_CN_Explanation=(TextView) itemView.findViewById(R.id.VOC_CN_Explanation);
            VOC_EG_Explanation=(TextView) itemView.findViewById(R.id.VOC_EG_Explanation);
        }
    }
}
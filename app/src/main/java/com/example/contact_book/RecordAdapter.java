package com.example.contact_book;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
//记录适配器
public class RecordAdapter extends RecyclerView.Adapter<RecordAdapter.ViewHolder> {
    private List<Record> recordList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView recordName;
        TextView recordNumber;
        TextView recordDate;
        TextView recordTime;
        TextView recordType;
        TextView recordPlace;

        public ViewHolder(View view) {
            super(view);
            recordName = (TextView) view.findViewById(R.id.RecordName);
            recordNumber = (TextView) view.findViewById(R.id.RecordNumber);
            recordDate = (TextView) view.findViewById(R.id.RecordDate);
            recordTime = (TextView) view.findViewById(R.id.RecordTime);
            recordType = (TextView) view.findViewById(R.id.RecordType);
            recordPlace = (TextView) view.findViewById(R.id.RecordPlace);
        }
    }

    //初始化
    public RecordAdapter(List<Record> recList) {
        recordList = recList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.record_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    //绑定数据
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Record record = recordList.get(position);
        holder.recordName.setText(record.getName());
        holder.recordNumber.setText(record.getNumber());
        holder.recordDate.setText(record.getDate());
        holder.recordTime.setText(record.getTime());
        holder.recordType.setText(record.getType());
        holder.recordPlace.setText(record.getPlace());
    }

    @Override
    public int getItemCount() {
        return recordList.size();
    }
}

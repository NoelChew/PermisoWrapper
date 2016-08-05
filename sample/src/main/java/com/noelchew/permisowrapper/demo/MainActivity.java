package com.noelchew.permisowrapper.demo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.greysonparrelli.permiso.Permiso;
import com.noelchew.permisowrapper.PermissionUtil;
import com.noelchew.permisowrapper.demo.adapter.DangerousActionAdapter;
import com.noelchew.permisowrapper.demo.listener.OnClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private Button btnCheckPermissions;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    private DangerousActionAdapter adapter;

    private GetPermission[] getPermissionArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Permiso.getInstance().setActivity(this);
        context = this;
        setContentView(R.layout.activity_main);

        btnCheckPermissions = (Button) findViewById(R.id.button_check_permissions);
        btnCheckPermissions.setOnClickListener(btnCheckPermissionsOnClickListener);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new DangerousActionAdapter(context, getDangerousActions(), listener);
        recyclerView.setAdapter(adapter);

        getPermissionArray = GetPermissionArrayData.getPermissionArrayData(context);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Permiso.getInstance().setActivity(this);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        Permiso.getInstance().onRequestPermissionResult(requestCode, permissions, grantResults);
    }

    private ArrayList<DangerousAction> getDangerousActions() {
        ArrayList<DangerousAction> dangerousActionArrayList = new ArrayList<>();
        dangerousActionArrayList.add(new DangerousAction("Pick Picture/Video"));
        dangerousActionArrayList.add(new DangerousAction("Take Picture"));
        dangerousActionArrayList.add(new DangerousAction("Take Video"));
        dangerousActionArrayList.add(new DangerousAction("Send Voice Message"));
        dangerousActionArrayList.add(new DangerousAction("Make Voice Call"));
        dangerousActionArrayList.add(new DangerousAction("Make Video Call"));
        dangerousActionArrayList.add(new DangerousAction("Share Location"));
        dangerousActionArrayList.add(new DangerousAction("Locate User"));
        dangerousActionArrayList.add(new DangerousAction("Autofill Area Code"));
        dangerousActionArrayList.add(new DangerousAction("Access Contacts"));
        dangerousActionArrayList.add(new DangerousAction("Recommend New Friends"));
        dangerousActionArrayList.add(new DangerousAction("Save Media to Storage"));
        dangerousActionArrayList.add(new DangerousAction("Save Content to Storage"));
        dangerousActionArrayList.add(new DangerousAction("Access Calendar"));
        dangerousActionArrayList.add(new DangerousAction("Access Phone Features"));
        dangerousActionArrayList.add(new DangerousAction("Get Phone Number"));
        dangerousActionArrayList.add(new DangerousAction("Make Phone Call"));
        dangerousActionArrayList.add(new DangerousAction("Access SMS"));
        dangerousActionArrayList.add(new DangerousAction("Send SMS"));
        dangerousActionArrayList.add(new DangerousAction("Read SMS"));
        dangerousActionArrayList.add(new DangerousAction("Access Phone Sensors"));

        return dangerousActionArrayList;
    }

    private OnClickListener listener = new OnClickListener() {
        @Override
        public void onClick(int position) {
            getPermissionArray[position].get();
        }
    };

    private View.OnClickListener btnCheckPermissionsOnClickListener  = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            PermissionUtil.startInstalledAppDetailsActivity(context);
        }
    };


}

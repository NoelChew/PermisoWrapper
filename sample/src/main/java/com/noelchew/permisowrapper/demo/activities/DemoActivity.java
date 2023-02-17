package com.noelchew.permisowrapper.demo.activities;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.greysonparrelli.permiso.Permiso;
import com.noelchew.permisowrapper.PermisoWrapper;
import com.noelchew.permisowrapper.demo.actions.GetDangerousActionArrayList;
import com.noelchew.permisowrapper.demo.permissions.GetPermission;
import com.noelchew.permisowrapper.demo.permissions.GetPermissionArrayList;
import com.noelchew.permisowrapper.demo.R;
import com.noelchew.permisowrapper.demo.adapter.DangerousActionAdapter;
import com.noelchew.permisowrapper.demo.listener.OnClickListener;

public class DemoActivity extends AppCompatActivity {

    private Context context;
    private Button btnCheckPermissions, btnCheckNotificationSettings;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    private DangerousActionAdapter adapter;

    private GetPermission[] getPermissionArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Permiso.getInstance().setActivity(this);
        context = this;
        setContentView(R.layout.activity_demo);

        btnCheckPermissions = (Button) findViewById(R.id.button_check_permissions);
        btnCheckPermissions.setOnClickListener(btnCheckPermissionsOnClickListener);

        btnCheckNotificationSettings = (Button) findViewById(R.id.button_check_notification_settings);
        btnCheckNotificationSettings.setOnClickListener(btnCheckNotificationsSettingsOnClickListener);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new DangerousActionAdapter(context, GetDangerousActionArrayList.getDangerousActions(), listener);
        recyclerView.setAdapter(adapter);

        getPermissionArray = GetPermissionArrayList.getPermissionArrayList(context);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
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

    private OnClickListener listener = new OnClickListener() {
        @Override
        public void onClick(int position) {
            getPermissionArray[position].get();
        }
    };

    private View.OnClickListener btnCheckPermissionsOnClickListener  = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            PermisoWrapper.startInstalledAppDetailsActivity(context);
        }
    };

    private View.OnClickListener btnCheckNotificationsSettingsOnClickListener  = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            PermisoWrapper.startInstalledAppNotificationSettingsActivity(context);
        }
    };


}

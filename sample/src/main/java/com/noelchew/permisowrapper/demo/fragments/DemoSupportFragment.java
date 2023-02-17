package com.noelchew.permisowrapper.demo.fragments;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.noelchew.permisowrapper.PermisoWrapper;
import com.noelchew.permisowrapper.demo.R;
import com.noelchew.permisowrapper.demo.actions.GetDangerousActionArrayList;
import com.noelchew.permisowrapper.demo.adapter.DangerousActionAdapter;
import com.noelchew.permisowrapper.demo.listener.OnClickListener;
import com.noelchew.permisowrapper.demo.permissions.GetPermission;
import com.noelchew.permisowrapper.demo.permissions.GetPermissionArrayList;

/**
 * Created by noelchew on 16/08/2016.
 */
public class DemoSupportFragment extends Fragment {

    private Context context;
    private Button btnCheckPermissions, btnCheckNotificationSettings;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    private DangerousActionAdapter adapter;

    private GetPermission[] getPermissionArray;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_demo, null);
        context = getActivity();
        btnCheckPermissions = (Button) view.findViewById(R.id.button_check_permissions);
        btnCheckPermissions.setOnClickListener(btnCheckPermissionsOnClickListener);

        btnCheckNotificationSettings = (Button) view.findViewById(R.id.button_check_notification_settings);
        btnCheckNotificationSettings.setOnClickListener(btnCheckNotificationsSettingsOnClickListener);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new DangerousActionAdapter(context, GetDangerousActionArrayList.getDangerousActions(), listener);
        recyclerView.setAdapter(adapter);

        getPermissionArray = GetPermissionArrayList.getPermissionArrayList(context);
        return view;
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

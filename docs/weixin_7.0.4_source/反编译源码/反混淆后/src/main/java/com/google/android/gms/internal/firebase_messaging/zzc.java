package com.google.android.gms.internal.firebase_messaging;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class zzc {
    private static final ClassLoader zzd = zzc.class.getClassLoader();

    static {
        AppMethodBeat.m2504i(108676);
        AppMethodBeat.m2505o(108676);
    }

    private zzc() {
    }

    public static void zza(Parcel parcel, Parcelable parcelable) {
        AppMethodBeat.m2504i(108675);
        if (parcelable == null) {
            parcel.writeInt(0);
            AppMethodBeat.m2505o(108675);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
        AppMethodBeat.m2505o(108675);
    }
}

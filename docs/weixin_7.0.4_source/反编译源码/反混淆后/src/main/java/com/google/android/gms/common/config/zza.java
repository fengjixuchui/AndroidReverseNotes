package com.google.android.gms.common.config;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zza extends GservicesValue<Boolean> {
    zza(String str, Boolean bool) {
        super(str, bool);
    }

    private static Boolean zza(Context context, String str, Boolean bool) {
        AppMethodBeat.m2504i(89536);
        String string = context.getSharedPreferences("gservices-direboot-cache", 0).getString(str, null);
        if (string != null) {
            try {
                bool = Boolean.valueOf(Boolean.parseBoolean(string));
                AppMethodBeat.m2505o(89536);
            } catch (NumberFormatException e) {
            }
            return bool;
        }
        AppMethodBeat.m2505o(89536);
        return bool;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object retrieve(String str) {
        AppMethodBeat.m2504i(89538);
        Boolean zza = GservicesValue.zzmu.zza(this.mKey, (Boolean) this.mDefaultValue);
        AppMethodBeat.m2505o(89538);
        return zza;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object retrieveFromDirectBootCache(Context context, String str, Object obj) {
        AppMethodBeat.m2504i(89537);
        Boolean zza = zza(context, str, (Boolean) obj);
        AppMethodBeat.m2505o(89537);
        return zza;
    }
}

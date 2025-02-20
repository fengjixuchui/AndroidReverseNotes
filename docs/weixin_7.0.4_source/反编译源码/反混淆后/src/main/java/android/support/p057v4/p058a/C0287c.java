package android.support.p057v4.p058a;

import android.graphics.Path;
import com.tencent.p177mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.p177mm.plugin.appbrand.jsapi.contact.C33279c;
import com.tencent.p177mm.plugin.appbrand.jsapi.p311m.C38339e;
import com.tencent.qqmusic.mediaplayer.PlayerException;
import com.tencent.ttpic.wav.WavFileHeader;
import java.util.ArrayList;

/* renamed from: android.support.v4.a.c */
public final class C0287c {

    /* renamed from: android.support.v4.a.c$a */
    static class C0285a {
        /* renamed from: Ha */
        int f203Ha;
        /* renamed from: Hb */
        boolean f204Hb;

        C0285a() {
        }
    }

    /* renamed from: android.support.v4.a.c$b */
    public static class C0286b {
        /* renamed from: Hc */
        public char f205Hc;
        /* renamed from: Hd */
        public float[] f206Hd;

        C0286b(char c, float[] fArr) {
            this.f205Hc = c;
            this.f206Hd = fArr;
        }

        C0286b(C0286b c0286b) {
            this.f205Hc = c0286b.f205Hc;
            this.f206Hd = C0287c.m491b(c0286b.f206Hd, c0286b.f206Hd.length);
        }

        /* renamed from: a */
        public static void m483a(C0286b[] c0286bArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < c0286bArr.length; i++) {
                C0286b.m482a(path, fArr, c, c0286bArr[i].f205Hc, c0286bArr[i].f206Hd);
                c = c0286bArr[i].f205Hc;
            }
        }

        /* renamed from: a */
        public final void mo464a(C0286b c0286b, C0286b c0286b2, float f) {
            for (int i = 0; i < c0286b.f206Hd.length; i++) {
                this.f206Hd[i] = (c0286b.f206Hd[i] * (1.0f - f)) + (c0286b2.f206Hd[i] * f);
            }
        }

        /* renamed from: a */
        private static void m482a(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            switch (c2) {
                case 'A':
                case PlayerException.EXCEPTION_IN_RELEASE /*97*/:
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case C33279c.CTRL_INDEX /*72*/:
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case C38339e.CTRL_INDEX /*84*/:
                case 'l':
                case 'm':
                case 't':
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f5, f6);
                    f4 = f6;
                    f3 = f5;
                    f2 = f6;
                    f = f5;
                    i = 2;
                    break;
                default:
                    i = 2;
                    break;
            }
            int i2 = 0;
            float f7 = f6;
            float f8 = f5;
            float f9 = f4;
            float f10 = f3;
            float f11 = f2;
            float f12 = f;
            while (i2 < fArr2.length) {
                float f13;
                boolean z;
                boolean z2;
                float f14;
                switch (c2) {
                    case 'A':
                        f5 = fArr2[i2 + 5];
                        f2 = fArr2[i2 + 6];
                        f = fArr2[i2 + 0];
                        f13 = fArr2[i2 + 1];
                        f9 = fArr2[i2 + 2];
                        z = fArr2[i2 + 3] != 0.0f;
                        if (fArr2[i2 + 4] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C0286b.m481a(path, f12, f11, f5, f2, f, f13, f9, z, z2);
                        f10 = fArr2[i2 + 5];
                        f9 = fArr2[i2 + 6];
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = f9;
                        f13 = f10;
                        break;
                    case 'C':
                        path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3], fArr2[i2 + 4], fArr2[i2 + 5]);
                        f14 = fArr2[i2 + 4];
                        f4 = fArr2[i2 + 5];
                        f10 = fArr2[i2 + 2];
                        f6 = f7;
                        f5 = f8;
                        f3 = fArr2[i2 + 3];
                        f2 = f10;
                        f = f4;
                        f13 = f14;
                        break;
                    case C33279c.CTRL_INDEX /*72*/:
                        path.lineTo(fArr2[i2 + 0], f11);
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = f11;
                        f13 = fArr2[i2 + 0];
                        break;
                    case 'L':
                        path.lineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        f14 = fArr2[i2 + 0];
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = fArr2[i2 + 1];
                        f13 = f14;
                        break;
                    case 'M':
                        f14 = fArr2[i2 + 0];
                        f4 = fArr2[i2 + 1];
                        if (i2 <= 0) {
                            path.moveTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                            f6 = f4;
                            f5 = f14;
                            f3 = f9;
                            f2 = f10;
                            f = f4;
                            f13 = f14;
                            break;
                        }
                        path.lineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = f4;
                        f13 = f14;
                        break;
                    case 'Q':
                        path.quadTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        f10 = fArr2[i2 + 0];
                        f9 = fArr2[i2 + 1];
                        f14 = fArr2[i2 + 2];
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = fArr2[i2 + 3];
                        f13 = f14;
                        break;
                    case 'S':
                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                            f6 = (2.0f * f12) - f10;
                            f3 = (2.0f * f11) - f9;
                        } else {
                            f3 = f11;
                            f6 = f12;
                        }
                        path.cubicTo(f6, f3, fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        f10 = fArr2[i2 + 0];
                        f9 = fArr2[i2 + 1];
                        f14 = fArr2[i2 + 2];
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = fArr2[i2 + 3];
                        f13 = f14;
                        break;
                    case C38339e.CTRL_INDEX /*84*/:
                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                            f12 = (2.0f * f12) - f10;
                            f11 = (2.0f * f11) - f9;
                        }
                        path.quadTo(f12, f11, fArr2[i2 + 0], fArr2[i2 + 1]);
                        f14 = fArr2[i2 + 0];
                        f6 = f7;
                        f5 = f8;
                        f3 = f11;
                        f2 = f12;
                        f = fArr2[i2 + 1];
                        f13 = f14;
                        break;
                    case 'V':
                        path.lineTo(f12, fArr2[i2 + 0]);
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = fArr2[i2 + 0];
                        f13 = f12;
                        break;
                    case PlayerException.EXCEPTION_IN_RELEASE /*97*/:
                        f5 = fArr2[i2 + 5] + f12;
                        f2 = fArr2[i2 + 6] + f11;
                        f = fArr2[i2 + 0];
                        f13 = fArr2[i2 + 1];
                        f9 = fArr2[i2 + 2];
                        z = fArr2[i2 + 3] != 0.0f;
                        if (fArr2[i2 + 4] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C0286b.m481a(path, f12, f11, f5, f2, f, f13, f9, z, z2);
                        f10 = f12 + fArr2[i2 + 5];
                        f9 = f11 + fArr2[i2 + 6];
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = f9;
                        f13 = f10;
                        break;
                    case 'c':
                        path.rCubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3], fArr2[i2 + 4], fArr2[i2 + 5]);
                        f6 = f7;
                        f5 = f8;
                        f3 = f11 + fArr2[i2 + 3];
                        f2 = f12 + fArr2[i2 + 2];
                        f = fArr2[i2 + 5] + f11;
                        f13 = f12 + fArr2[i2 + 4];
                        break;
                    case 'h':
                        path.rLineTo(fArr2[i2 + 0], 0.0f);
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = f11;
                        f13 = f12 + fArr2[i2 + 0];
                        break;
                    case 'l':
                        path.rLineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = fArr2[i2 + 1] + f11;
                        f13 = f12 + fArr2[i2 + 0];
                        break;
                    case 'm':
                        f14 = f12 + fArr2[i2 + 0];
                        f4 = fArr2[i2 + 1] + f11;
                        if (i2 <= 0) {
                            path.rMoveTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                            f6 = f4;
                            f5 = f14;
                            f3 = f9;
                            f2 = f10;
                            f = f4;
                            f13 = f14;
                            break;
                        }
                        path.rLineTo(fArr2[i2 + 0], fArr2[i2 + 1]);
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = f4;
                        f13 = f14;
                        break;
                    case 'q':
                        path.rQuadTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        f6 = f7;
                        f5 = f8;
                        f3 = f11 + fArr2[i2 + 1];
                        f2 = f12 + fArr2[i2 + 0];
                        f = fArr2[i2 + 3] + f11;
                        f13 = f12 + fArr2[i2 + 2];
                        break;
                    case 's':
                        f6 = 0.0f;
                        f3 = 0.0f;
                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                            f6 = f12 - f10;
                            f3 = f11 - f9;
                        }
                        path.rCubicTo(f6, f3, fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3]);
                        f6 = f7;
                        f5 = f8;
                        f3 = f11 + fArr2[i2 + 1];
                        f2 = f12 + fArr2[i2 + 0];
                        f = fArr2[i2 + 3] + f11;
                        f13 = f12 + fArr2[i2 + 2];
                        break;
                    case 't':
                        f6 = 0.0f;
                        f4 = 0.0f;
                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                            f6 = f12 - f10;
                            f4 = f11 - f9;
                        }
                        path.rQuadTo(f6, f4, fArr2[i2 + 0], fArr2[i2 + 1]);
                        f10 = f12 + f6;
                        f6 = f7;
                        f5 = f8;
                        f3 = f11 + f4;
                        f2 = f10;
                        f = fArr2[i2 + 1] + f11;
                        f13 = f12 + fArr2[i2 + 0];
                        break;
                    case 'v':
                        path.rLineTo(0.0f, fArr2[i2 + 0]);
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = fArr2[i2 + 0] + f11;
                        f13 = f12;
                        break;
                    default:
                        f6 = f7;
                        f5 = f8;
                        f3 = f9;
                        f2 = f10;
                        f = f11;
                        f13 = f12;
                        break;
                }
                i2 += i;
                f7 = f6;
                f8 = f5;
                f9 = f3;
                f10 = f2;
                f11 = f;
                f12 = f13;
                c = c2;
            }
            fArr[0] = f12;
            fArr[1] = f11;
            fArr[2] = f10;
            fArr[3] = f9;
            fArr[4] = f8;
            fArr[5] = f7;
        }

        /* renamed from: a */
        private static void m481a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            Path path2 = path;
            while (true) {
                double toRadians = Math.toRadians((double) f7);
                double cos = Math.cos(toRadians);
                double sin = Math.sin(toRadians);
                double d = ((((double) f) * cos) + (((double) f2) * sin)) / ((double) f5);
                double d2 = ((((double) (-f)) * sin) + (((double) f2) * cos)) / ((double) f6);
                double d3 = ((((double) f3) * cos) + (((double) f4) * sin)) / ((double) f5);
                double d4 = ((((double) (-f3)) * sin) + (((double) f4) * cos)) / ((double) f6);
                double d5 = d - d3;
                double d6 = d2 - d4;
                double d7 = (d + d3) / 2.0d;
                double d8 = (d2 + d4) / 2.0d;
                double d9 = (d5 * d5) + (d6 * d6);
                if (d9 != 0.0d) {
                    double d10 = (1.0d / d9) - 0.25d;
                    if (d10 < 0.0d) {
                        float sqrt = (float) (Math.sqrt(d9) / 1.99999d);
                        f5 *= sqrt;
                        f6 *= sqrt;
                    } else {
                        d9 = Math.sqrt(d10);
                        d5 *= d9;
                        d6 *= d9;
                        if (z == z2) {
                            d6 = d7 - d6;
                            d5 += d8;
                        } else {
                            d6 += d7;
                            d5 = d8 - d5;
                        }
                        d7 = Math.atan2(d2 - d5, d - d6);
                        d3 = Math.atan2(d4 - d5, d3 - d6) - d7;
                        if (z2 != (d3 >= 0.0d)) {
                            if (d3 > 0.0d) {
                                d3 -= 6.283185307179586d;
                            } else {
                                d3 += 6.283185307179586d;
                            }
                        }
                        d6 *= (double) f5;
                        d = ((double) f6) * d5;
                        C0286b.m480a(path2, (d6 * cos) - (d * sin), (d6 * sin) + (cos * d), (double) f5, (double) f6, (double) f, (double) f2, toRadians, d7, d3);
                        return;
                    }
                }
                return;
            }
        }

        /* renamed from: a */
        private static void m480a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            int ceil = (int) Math.ceil(Math.abs((4.0d * d9) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d10 = (((-d3) * cos) * sin2) - ((d4 * sin) * cos2);
            cos2 = (cos2 * (d4 * cos)) + (sin2 * ((-d3) * sin));
            double d11 = d9 / ((double) ceil);
            int i = 0;
            while (i < ceil) {
                double d12 = d8 + d11;
                sin2 = Math.sin(d12);
                double cos3 = Math.cos(d12);
                double d13 = (((d3 * cos) * cos3) + d) - ((d4 * sin) * sin2);
                double d14 = ((d4 * cos) * sin2) + (((d3 * sin) * cos3) + d2);
                double d15 = (((-d3) * cos) * sin2) - ((d4 * sin) * cos3);
                cos3 = (cos3 * (d4 * cos)) + (sin2 * ((-d3) * sin));
                sin2 = Math.tan((d12 - d8) / 2.0d);
                sin2 = ((Math.sqrt((sin2 * (3.0d * sin2)) + 4.0d) - 1.0d) * Math.sin(d12 - d8)) / 3.0d;
                d10 = (d10 * sin2) + d5;
                double d16 = d6 + (cos2 * sin2);
                double d17 = d13 - (sin2 * d15);
                sin2 = d14 - (sin2 * cos3);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d10, (float) d16, (float) d17, (float) sin2, (float) d13, (float) d14);
                cos2 = cos3;
                d10 = d15;
                d8 = d12;
                i++;
                d6 = d14;
                d5 = d13;
            }
        }
    }

    /* renamed from: b */
    static float[] m491b(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = i + 0;
        length = Math.min(i2, length + 0);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, length);
        return fArr2;
    }

    /* renamed from: K */
    public static Path m485K(String str) {
        Path path = new Path();
        C0286b[] L = C0287c.m486L(str);
        if (L == null) {
            return null;
        }
        try {
            C0286b.m483a(L, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: L */
    public static C0286b[] m486L(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int f = C0287c.m492f(str, i);
            String trim = str.substring(i2, f).trim();
            if (trim.length() > 0) {
                C0287c.m488a(arrayList, trim.charAt(0), C0287c.m487M(trim));
            }
            i = f + 1;
            i2 = f;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            C0287c.m488a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0286b[]) arrayList.toArray(new C0286b[arrayList.size()]);
    }

    /* renamed from: a */
    public static C0286b[] m490a(C0286b[] c0286bArr) {
        if (c0286bArr == null) {
            return null;
        }
        C0286b[] c0286bArr2 = new C0286b[c0286bArr.length];
        for (int i = 0; i < c0286bArr.length; i++) {
            c0286bArr2[i] = new C0286b(c0286bArr[i]);
        }
        return c0286bArr2;
    }

    /* renamed from: a */
    public static boolean m489a(C0286b[] c0286bArr, C0286b[] c0286bArr2) {
        if (c0286bArr == null || c0286bArr2 == null || c0286bArr.length != c0286bArr2.length) {
            return false;
        }
        int i = 0;
        while (i < c0286bArr.length) {
            if (c0286bArr[i].f205Hc != c0286bArr2[i].f205Hc || c0286bArr[i].f206Hd.length != c0286bArr2[i].f206Hd.length) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: f */
    private static int m492f(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 65) * (charAt - 90) <= 0 || (charAt - 97) * (charAt - 122) <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private static void m488a(ArrayList<C0286b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0286b(c, fArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062 A:{Catch:{ NumberFormatException -> 0x007e }} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075 A:{Catch:{ NumberFormatException -> 0x007e }} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A:{Catch:{ NumberFormatException -> 0x007e }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: M */
    private static float[] m487M(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C0285a c0285a = new C0285a();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                c0285a.f204Hb = false;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = i;
                while (i6 < str.length()) {
                    switch (str.charAt(i6)) {
                        case ' ':
                        case WavFileHeader.WAV_FILE_HEADER_SIZE /*44*/:
                            i3 = 0;
                            i5 = 1;
                            break;
                        case IMediaObject.TYPE_BUSINESS_CARD /*45*/:
                            if (i6 != i && i3 == 0) {
                                c0285a.f204Hb = true;
                                i3 = 0;
                                i5 = 1;
                                break;
                            }
                        case '.':
                            if (i4 != 0) {
                                c0285a.f204Hb = true;
                                i3 = 0;
                                i5 = 1;
                                break;
                            }
                            i3 = 0;
                            i4 = 1;
                            break;
                        case 'E':
                        case 'e':
                            i3 = 1;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                    if (i5 == 0) {
                        i6++;
                    } else {
                        c0285a.f203Ha = i6;
                        i4 = c0285a.f203Ha;
                        if (i >= i4) {
                            i3 = i2 + 1;
                            fArr[i2] = Float.parseFloat(str.substring(i, i4));
                        } else {
                            i3 = i2;
                        }
                        if (c0285a.f204Hb) {
                            i = i4 + 1;
                            i2 = i3;
                        } else {
                            i = i4;
                            i2 = i3;
                        }
                    }
                }
                c0285a.f203Ha = i6;
                i4 = c0285a.f203Ha;
                if (i >= i4) {
                }
                if (c0285a.f204Hb) {
                }
            }
            return C0287c.m491b(fArr, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }
}

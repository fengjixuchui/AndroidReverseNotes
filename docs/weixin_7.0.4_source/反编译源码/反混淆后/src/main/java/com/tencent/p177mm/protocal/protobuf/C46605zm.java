package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.zm */
public final class C46605zm extends C1331a {
    public String weG;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(28397);
        C6092b c6092b;
        int f;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.weG == null) {
                c6092b = new C6092b("Not all required fields were included: LoginUrl");
                AppMethodBeat.m2505o(28397);
                throw c6092b;
            }
            if (this.weG != null) {
                c6093a.mo13475e(1, this.weG);
            }
            AppMethodBeat.m2505o(28397);
            return 0;
        } else if (i == 1) {
            if (this.weG != null) {
                f = C6091a.m9575f(1, this.weG) + 0;
            } else {
                f = 0;
            }
            AppMethodBeat.m2505o(28397);
            return f;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            if (this.weG == null) {
                c6092b = new C6092b("Not all required fields were included: LoginUrl");
                AppMethodBeat.m2505o(28397);
                throw c6092b;
            }
            AppMethodBeat.m2505o(28397);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C46605zm c46605zm = (C46605zm) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    c46605zm.weG = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28397);
                    return 0;
                default:
                    AppMethodBeat.m2505o(28397);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(28397);
            return -1;
        }
    }
}

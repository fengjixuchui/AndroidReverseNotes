package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.ava */
public final class ava extends C1331a {
    public String gfa;
    public LinkedList<bgc> vEN = new LinkedList();

    public ava() {
        AppMethodBeat.m2504i(80108);
        AppMethodBeat.m2505o(80108);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(80109);
        int f;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.gfa != null) {
                c6093a.mo13475e(1, this.gfa);
            }
            c6093a.mo13474e(2, 8, this.vEN);
            AppMethodBeat.m2505o(80109);
            return 0;
        } else if (i == 1) {
            if (this.gfa != null) {
                f = C6091a.m9575f(1, this.gfa) + 0;
            } else {
                f = 0;
            }
            int c = f + C6087a.m9552c(2, 8, this.vEN);
            AppMethodBeat.m2505o(80109);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vEN.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(80109);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            ava ava = (ava) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    ava.gfa = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(80109);
                    return 0;
                case 2:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bgc bgc = new bgc();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = bgc.populateBuilderWithField(c6086a3, bgc, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        ava.vEN.add(bgc);
                    }
                    AppMethodBeat.m2505o(80109);
                    return 0;
                default:
                    AppMethodBeat.m2505o(80109);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(80109);
            return -1;
        }
    }
}

package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bs */
public final class C23375bs extends C1331a {
    public brf vDY;
    public brf vDZ;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(94501);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.vDY != null) {
                c6093a.mo13479iy(1, this.vDY.computeSize());
                this.vDY.writeFields(c6093a);
            }
            if (this.vDZ != null) {
                c6093a.mo13479iy(2, this.vDZ.computeSize());
                this.vDZ.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(94501);
            return 0;
        } else if (i == 1) {
            if (this.vDY != null) {
                ix = C6087a.m9557ix(1, this.vDY.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vDZ != null) {
                ix += C6087a.m9557ix(2, this.vDZ.computeSize());
            }
            AppMethodBeat.m2505o(94501);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(94501);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C23375bs c23375bs = (C23375bs) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            brf brf;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        brf = new brf();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = brf.populateBuilderWithField(c6086a3, brf, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c23375bs.vDY = brf;
                    }
                    AppMethodBeat.m2505o(94501);
                    return 0;
                case 2:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        brf = new brf();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = brf.populateBuilderWithField(c6086a3, brf, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c23375bs.vDZ = brf;
                    }
                    AppMethodBeat.m2505o(94501);
                    return 0;
                default:
                    AppMethodBeat.m2505o(94501);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(94501);
            return -1;
        }
    }
}

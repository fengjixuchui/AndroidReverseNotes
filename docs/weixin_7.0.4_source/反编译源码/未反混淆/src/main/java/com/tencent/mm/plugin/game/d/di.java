package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import java.util.LinkedList;

public final class di extends a {
    public LinkedList<dh> naO = new LinkedList();

    public di() {
        AppMethodBeat.i(111675);
        AppMethodBeat.o(111675);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(111676);
        int c;
        byte[] bArr;
        if (i == 0) {
            ((e.a.a.c.a) objArr[0]).e(1, 8, this.naO);
            AppMethodBeat.o(111676);
            return 0;
        } else if (i == 1) {
            c = e.a.a.a.c(1, 8, this.naO) + 0;
            AppMethodBeat.o(111676);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.naO.clear();
            e.a.a.a.a aVar = new e.a.a.a.a(bArr, unknownTagHandler);
            for (c = a.getNextFieldNumber(aVar); c > 0; c = a.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, c)) {
                    aVar.ems();
                }
            }
            AppMethodBeat.o(111676);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar2 = (e.a.a.a.a) objArr[0];
            di diVar = (di) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar2.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        dh dhVar = new dh();
                        e.a.a.a.a aVar3 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = dhVar.populateBuilderWithField(aVar3, dhVar, a.getNextFieldNumber(aVar3))) {
                        }
                        diVar.naO.add(dhVar);
                    }
                    AppMethodBeat.o(111676);
                    return 0;
                default:
                    AppMethodBeat.o(111676);
                    return -1;
            }
        } else {
            AppMethodBeat.o(111676);
            return -1;
        }
    }
}

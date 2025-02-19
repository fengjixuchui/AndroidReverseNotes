package com.tencent.mm.ba;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

public final class m {
    int bJt = -1;
    public int cBc = 0;
    private String czD = (this.id + "_" + this.cBc);
    String fMt = "";
    private String frQ = "";
    private String frR = "";
    private int frS = 0;
    private int frT = 0;
    public int id = 0;
    String name = "";
    int size = 0;
    public int status = 0;
    public int version = 0;

    public m() {
        AppMethodBeat.i(78480);
        AppMethodBeat.o(78480);
    }

    public final void d(Cursor cursor) {
        AppMethodBeat.i(78481);
        this.version = cursor.getInt(2);
        this.name = cursor.getString(3);
        this.size = cursor.getInt(4);
        this.fMt = cursor.getString(5);
        this.status = cursor.getInt(6);
        this.frQ = cursor.getString(8);
        this.frR = cursor.getString(9);
        this.cBc = cursor.getInt(7);
        this.frT = cursor.getInt(11);
        this.id = cursor.getInt(1);
        this.frS = cursor.getInt(10);
        this.czD = cursor.getString(0);
        AppMethodBeat.o(78481);
    }

    public final ContentValues Hl() {
        String str;
        String str2;
        AppMethodBeat.i(78482);
        ContentValues contentValues = new ContentValues();
        if ((this.bJt & 2) != 0) {
            contentValues.put("id", Integer.valueOf(this.id));
        }
        if ((this.bJt & 4) != 0) {
            contentValues.put("version", Integer.valueOf(this.version));
        }
        if ((this.bJt & 8) != 0) {
            str = "name";
            if (this.name == null) {
                str2 = "";
            } else {
                str2 = this.name;
            }
            contentValues.put(str, str2);
        }
        if ((this.bJt & 16) != 0) {
            contentValues.put("size", Integer.valueOf(this.size));
        }
        if ((this.bJt & 32) != 0) {
            contentValues.put("packname", ais());
        }
        if ((this.bJt & 64) != 0) {
            contentValues.put("status", Integer.valueOf(this.status));
        }
        if ((this.bJt & 128) != 0) {
            contentValues.put("type", Integer.valueOf(this.cBc));
        }
        if ((this.bJt & 256) != 0) {
            str = "reserved1";
            if (this.frQ == null) {
                str2 = "";
            } else {
                str2 = this.frQ;
            }
            contentValues.put(str, str2);
        }
        if ((this.bJt & 512) != 0) {
            str = "reserved2";
            if (this.frR == null) {
                str2 = "";
            } else {
                str2 = this.frR;
            }
            contentValues.put(str, str2);
        }
        if ((this.bJt & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0) {
            contentValues.put("reserved3", Integer.valueOf(this.frS));
        }
        if ((this.bJt & 2048) != 0) {
            contentValues.put("reserved4", Integer.valueOf(this.frT));
        }
        if ((this.bJt & 1) != 0) {
            contentValues.put("localId", this.id + "_" + this.cBc);
        }
        AppMethodBeat.o(78482);
        return contentValues;
    }

    public final String ais() {
        return this.fMt == null ? "" : this.fMt;
    }
}

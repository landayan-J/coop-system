package dev.j.data;

import java.sql.SQLException;
import java.sql.Types;
import java.util.LinkedList;
import java.util.List;

import javax.sql.rowset.CachedRowSet;

import dev.j.App;
import dev.j.enums.CivilStatus;
import dev.j.models.hr.Member;
import dev.sol.db.DBParam;
import dev.sol.db.DBService;

public class MemberDAO {
    public static final String TABLE = "member";
    public static final DBService DB = App.DB_COOP;

    private static Member data(CachedRowSet crs) {
        try {
            Integer memberId = crs.getInt("memberID");
            String Fname = crs.getString("Fname");
            String Mname = crs.getString("Mname");
            String Lname = crs.getString("Lname");
            String DateofBirth = crs.getString("DateofBirth");
            String PlaceofBirth = crs.getString("PlaceofBirth");
            // CivilStatus Status = CivilStatus.values()[crs.getInt("Status")];
            int status = crs.getInt("Status");
            String CurrentAddress = crs.getString("CurrentAddress");
            String Occupation = crs.getString("Occupation");
            Integer Office = crs.getInt("OfficeID");
            double Salary = crs.getDouble("Salary");
            String Sourceofincome = crs.getString("SourceofIncome");
            String Nearestrelative = crs.getString("NearestRelative");
            String RelationShip = crs.getString("Relationship");
            String Dependent = crs.getString("Dependent");
            Integer Stockshare = crs.getInt("StockShare");
            long StockAmount = crs.getLong("StockAmount");
            Integer StockPaid = crs.getInt("StockPaid");
            long amountpaid = crs.getLong("AmountPaid");

            return new Member(memberId, Fname, Mname, Lname, DateofBirth, PlaceofBirth, status, CurrentAddress,
                    Occupation, Office, Salary, Sourceofincome, Nearestrelative, RelationShip, Dependent, Stockshare,
                    StockAmount, StockPaid, amountpaid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static DBParam[] paramlist(Member member) {
        List<DBParam> paramlist = new LinkedList<>();
        paramlist.add(new DBParam(Types.INTEGER, "memberID", member.getMemberID()));
        paramlist.add(new DBParam(Types.VARCHAR, "Fname", member.getFname()));
        paramlist.add(new DBParam(Types.VARCHAR, "Lname", member.getLname()));
        paramlist.add(new DBParam(Types.VARCHAR, "DateofBirth", member.getDateofBirth()));
        paramlist.add(new DBParam(Types.VARCHAR, "PlaceofBirth", member.getPlaceofBirth()));
        paramlist.add(new DBParam(Types.INTEGER, "Status", member.getStatus()));
        paramlist.add(new DBParam(Types.VARCHAR, "CurrentAddress", member.getCurrentAddress()));
        paramlist.add(new DBParam(Types.VARCHAR, "Occupation", member.getOccupation()));
        paramlist.add(new DBParam(Types.INTEGER, "OfficeID", member.getOffice()));
        paramlist.add(new DBParam(Types.DOUBLE, "Salary", member.getSalary()));
        paramlist.add(new DBParam(Types.VARCHAR, "SourceofIncome", member.getSourceofincome()));
        paramlist.add(new DBParam(Types.VARCHAR, "NearestRelative", member.getNearestRelative()));
        paramlist.add(new DBParam(Types.VARCHAR, "Relationship", member.getRelationShip()));
        paramlist.add(new DBParam(Types.VARCHAR, "Dependent", member.getDependent()));
        paramlist.add(new DBParam(Types.INTEGER, "StockShare", member.getStockshare()));
        paramlist.add(new DBParam(Types.DECIMAL, "StockAmount", member.getStockAmount()));
        paramlist.add(new DBParam(Types.INTEGER, "StockPaid", member.getStockPaid()));
        paramlist.add(new DBParam(Types.DECIMAL, "AmountPaid", member.getAmountPaid()));
        return paramlist.toArray(new DBParam[0]);
    }

    public static List<Member> getMemberList() {
        CachedRowSet crs = DB.select_all(TABLE);
        List<Member> list = new LinkedList<>();

        try {
            while (crs.next()) {
                Member member = data(crs);
                if (member != null)
                    list.add(member);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void insert(Member member) {
        DB.insert(TABLE, paramlist(member));
    }

    public static void delete(Member member) {
        DB.delete(TABLE, new DBParam(Types.INTEGER, "memberID", member.getMemberID()));
    }

}

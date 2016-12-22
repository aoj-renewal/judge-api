package jp.ac.u_aizu.judge.source;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Source {
    @Id
    @Column(name = "PROBLEMID")
    private String problemId;
    private String title;
    private String subtitle;
    private String place;
    private String abbr;
    private String auther1;
    private String auther2;
    private String year;
    private String month;
    private String day;
    private String note;
    private String url;
    private String judge;
    private String url2;

    public String getProblemId() {
        return problemId;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getPlace() {
        return place;
    }

    public String getAbbr() {
        return abbr;
    }

    public String getAuther1() {
        return auther1;
    }

    public String getAuther2() {
        return auther2;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getNote() {
        return note;
    }

    public String getUrl() {
        return url;
    }

    public String getJudge() {
        return judge;
    }

    public String getUrl2() {
        return url2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Source source = (Source) o;

        if (problemId != null ? !problemId.equals(source.problemId) : source.problemId != null) return false;
        if (title != null ? !title.equals(source.title) : source.title != null) return false;
        if (subtitle != null ? !subtitle.equals(source.subtitle) : source.subtitle != null) return false;
        if (place != null ? !place.equals(source.place) : source.place != null) return false;
        if (abbr != null ? !abbr.equals(source.abbr) : source.abbr != null) return false;
        if (auther1 != null ? !auther1.equals(source.auther1) : source.auther1 != null) return false;
        if (auther2 != null ? !auther2.equals(source.auther2) : source.auther2 != null) return false;
        if (year != null ? !year.equals(source.year) : source.year != null) return false;
        if (month != null ? !month.equals(source.month) : source.month != null) return false;
        if (day != null ? !day.equals(source.day) : source.day != null) return false;
        if (note != null ? !note.equals(source.note) : source.note != null) return false;
        if (url != null ? !url.equals(source.url) : source.url != null) return false;
        if (judge != null ? !judge.equals(source.judge) : source.judge != null) return false;
        return url2 != null ? url2.equals(source.url2) : source.url2 == null;

    }

    @Override
    public int hashCode() {
        int result = problemId != null ? problemId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (subtitle != null ? subtitle.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (abbr != null ? abbr.hashCode() : 0);
        result = 31 * result + (auther1 != null ? auther1.hashCode() : 0);
        result = 31 * result + (auther2 != null ? auther2.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (judge != null ? judge.hashCode() : 0);
        result = 31 * result + (url2 != null ? url2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Source{" +
                "problemId='" + problemId + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", place='" + place + '\'' +
                ", abbr='" + abbr + '\'' +
                ", auther1='" + auther1 + '\'' +
                ", auther2='" + auther2 + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", note='" + note + '\'' +
                ", url='" + url + '\'' +
                ", judge='" + judge + '\'' +
                ", url2='" + url2 + '\'' +
                '}';
    }
}

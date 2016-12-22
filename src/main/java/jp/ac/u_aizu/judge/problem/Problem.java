package jp.ac.u_aizu.judge.problem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Problem {
    @Id
    private String id;
    private Integer available;
    private Integer doctype;
    private String name;
    @Column(name = "PROBLEMTIMELIMIT")
    private Integer problemTimeLimit;
    @Column(name = "PROBLEMMEMORYLIMIT")
    private Integer problemMemoryLimit;
    private Integer submissions;
    private Integer accepted;
    @Column(name = "WRONGANSWER")
    private Integer wrongAnswer;
    @Column(name = "TIMELIMIT")
    private Integer timeLimit;
    @Column(name = "MEMORYLIMIT")
    private Integer memoryLimit;
    @Column(name = "OUTPUTLIMIT")
    private Integer outputLimit;
    @Column(name = "RUNTIMEERROR")
    private Integer runtimeError;
    @Column(name = "PUBLICATIONDATE")
    private String publicationDate;
    @Column(name = "SOLVEDUSER")
    private Integer solvedUser;

    public String getId() {
        return id;
    }

    public Integer getAvailable() {
        return available;
    }

    public Integer getDoctype() {
        return doctype;
    }

    public String getName() {
        return name;
    }

    public Integer getProblemTimeLimit() {
        return problemTimeLimit;
    }

    public Integer getProblemMemoryLimit() {
        return problemMemoryLimit;
    }

    public Integer getSubmissions() {
        return submissions;
    }

    public Integer getAccepted() {
        return accepted;
    }

    public Integer getWrongAnswer() {
        return wrongAnswer;
    }

    public Integer getTimeLimit() {
        return timeLimit;
    }

    public Integer getMemoryLimit() {
        return memoryLimit;
    }

    public Integer getOutputLimit() {
        return outputLimit;
    }

    public Integer getRuntimeError() {
        return runtimeError;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public Integer getSolvedUser() {
        return solvedUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Problem problem = (Problem) o;

        if (!id.equals(problem.id)) return false;
        if (!available.equals(problem.available)) return false;
        if (!doctype.equals(problem.doctype)) return false;
        if (!name.equals(problem.name)) return false;
        if (!problemTimeLimit.equals(problem.problemTimeLimit)) return false;
        if (!problemMemoryLimit.equals(problem.problemMemoryLimit)) return false;
        if (!submissions.equals(problem.submissions)) return false;
        if (!accepted.equals(problem.accepted)) return false;
        if (!wrongAnswer.equals(problem.wrongAnswer)) return false;
        if (!timeLimit.equals(problem.timeLimit)) return false;
        if (!memoryLimit.equals(problem.memoryLimit)) return false;
        if (!outputLimit.equals(problem.outputLimit)) return false;
        if (!runtimeError.equals(problem.runtimeError)) return false;
        if (!publicationDate.equals(problem.publicationDate)) return false;
        return solvedUser.equals(problem.solvedUser);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + available.hashCode();
        result = 31 * result + doctype.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + problemTimeLimit.hashCode();
        result = 31 * result + problemMemoryLimit.hashCode();
        result = 31 * result + submissions.hashCode();
        result = 31 * result + accepted.hashCode();
        result = 31 * result + wrongAnswer.hashCode();
        result = 31 * result + timeLimit.hashCode();
        result = 31 * result + memoryLimit.hashCode();
        result = 31 * result + outputLimit.hashCode();
        result = 31 * result + runtimeError.hashCode();
        result = 31 * result + publicationDate.hashCode();
        result = 31 * result + solvedUser.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "id='" + id + '\'' +
                ", available=" + available +
                ", doctype=" + doctype +
                ", name='" + name + '\'' +
                ", problemTimeLimit=" + problemTimeLimit +
                ", problemMemoryLimit=" + problemMemoryLimit +
                ", submissions=" + submissions +
                ", accepted=" + accepted +
                ", wrongAnswer=" + wrongAnswer +
                ", timeLimit=" + timeLimit +
                ", memoryLimit=" + memoryLimit +
                ", outputLimit=" + outputLimit +
                ", runtimeError=" + runtimeError +
                ", publicationDate='" + publicationDate + '\'' +
                ", solvedUser=" + solvedUser +
                '}';
    }
}

package org.zalando.nakadi.client.java.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a Poblem Type.
 *
 */
public class Problem {
    private final String type;
    private final String title;
    private final Integer status;
    private final String detail;
    private final String instance;

    /**
     * @param type
     *            Identifies the problem type.
     * @param title
     *            A short, summary of the problem type.
     * @param status
     *            The HTTP status code generated by the origin server for this occurrence of the problem.
     * @param detail
     *            A human readable explanation specific to this occurrence of the problem.
     * @param instance
     *            An absolute URI that identifies the specific occurrence of the problem.
     */
    @JsonCreator
    public Problem(@JsonProperty("type") String type, @JsonProperty("title") String title, @JsonProperty("status") Integer status, @JsonProperty("detail") String detail,
            @JsonProperty("instance") String instance) {
        this.type = type;
        this.title = title;
        this.status = status;
        this.detail = detail;
        this.instance = instance;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDetail() {
        return detail;
    }

    public String getInstance() {
        return instance;
    }
    
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((detail == null) ? 0 : detail.hashCode());
        result = prime * result + ((instance == null) ? 0 : instance.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Problem other = (Problem) obj;
        if (detail == null) {
            if (other.detail != null)
                return false;
        } else if (!detail.equals(other.detail))
            return false;
        if (instance == null) {
            if (other.instance != null)
                return false;
        } else if (!instance.equals(other.instance))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Problem [type=" + type + ", title=" + title + ", status=" + status + ", detail=" + detail + ", instance=" + instance + "]";
    }

}

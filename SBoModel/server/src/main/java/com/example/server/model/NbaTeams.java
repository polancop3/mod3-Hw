package com.example.server.model;

import javax.persistence.*;

@Entity
@Table(name ="nba_teams")
public class NbaTeams {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String team;

    @Column
    private String star;

    @Column
    private int standing;

    @Column
    private Boolean favorite;

    public NbaTeams(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public int getStanding() {
        return standing;
    }

    public void setStanding(int standing) {
        this.standing = standing;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}

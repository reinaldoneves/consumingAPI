package com.example.resttemplate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Trello {

    private String name;
    private String id;
    private String actions;
    private String boardStars;
    private String cards;
    private boolean card_pluginData;
    private String checklists;
    private boolean customFields;
    private String fields;
    private String labels;
    private String lists;
    private String members;
    private String memberships;
    private boolean pluginData;
    private boolean organization;
    private boolean organization_pluginData;
    private boolean myPrefs;
    private boolean tags;

}

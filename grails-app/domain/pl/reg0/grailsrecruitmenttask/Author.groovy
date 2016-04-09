package pl.reg0.grailsrecruitmenttask

class Author {
    String name
    Integer noOfEdits = 0
    static hasMany = [
            entries: BlogEntry
    ]
}

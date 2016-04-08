package pl.reg0.grailsrecruitmenttask

class BlogEntry {

    String title
    String contents

    EntryStatus status

    static constraints = {
        title blank: false
        contents blank: false
    }
}

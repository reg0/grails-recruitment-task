package pl.reg0.grailsrecruitmenttask

class BlogEntry {

    String title
    String contents

    static constraints = {
        title blank: false
        contents blank: false
    }
}

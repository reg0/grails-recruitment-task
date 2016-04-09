package pl.reg0.grailsrecruitmenttask

class EntryService {

    static transactional = true

    List<BlogEntry> list() {
        BlogEntry.list([sort: 'id', order: 'desc'])
    }

    List<BlogEntry> filter(String filter) {
        // FIXME: (1) fix database query performace
        BlogEntry.list().findAll {
            it.contents.contains(filter) || it.title.contains(filter) || it.author.name.contains(filter)
        }
    }
}

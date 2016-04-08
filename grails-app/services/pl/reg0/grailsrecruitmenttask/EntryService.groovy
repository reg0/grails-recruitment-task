package pl.reg0.grailsrecruitmenttask

class EntryService {

    List<BlogEntry> list() {
        BlogEntry.list([sort: 'id', order: 'desc'])
    }

    BlogEntry save(Long entryId, String newTitle, String newContents) {
        BlogEntry entry = entryId ? BlogEntry.get(entryId) : new BlogEntry(status: EntryStatus.DRAFT)

        entry.title = newTitle
        entry.contents = newContents

        entry.save()
    }
}

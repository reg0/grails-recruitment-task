package pl.reg0.grailsrecruitmenttask

class StatusFlowService {

    def publish(Long entryId) {
        BlogEntry entry = BlogEntry.get(entryId)
        entry.status = EntryStatus.PUBLISHED
        entry.save()
    }
}

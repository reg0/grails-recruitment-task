package pl.reg0.grailsrecruitmenttask

class EntryController {

    EntryService entryService

    def index(String filter) {
        if (filter) {
            String subject = message(code: 'email.subject')
            Closure contentClosure = { String authorName ->
                message(code: 'email.content', args: [authorName])
            }
            [entries: entryService.filter(filter, subject, contentClosure)]
        } else {
            [entries: entryService.list()]
        }
    }

}

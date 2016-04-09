package pl.reg0.grailsrecruitmenttask

class EntryService {

    static transactional = true

    List<BlogEntry> list() {
        BlogEntry.list([sort: 'id', order: 'desc'])
    }

    List<BlogEntry> filter(String filter, String subject, Closure contentClosure) {
        // FIXME: (1) evaluate and fix database query performace
        List entries = BlogEntry.list().findAll {
            it.contents.contains(filter) || it.title.contains(filter) || it.author.name.contains(filter)
        }

        // TODO: (2) how to avoid duplicated authors here using simplest code?
        notifyAuthors(entries*.author, subject, contentClosure)

        return entries
    }

    private void notifyAuthors(List<Author> authors, String subject, Closure contentClosure) {
        authors.each {
            // TODO: (3) what are advantages of using closure here? how it works? why couldn't or shouldn't we call message(code: '...') here in service?
            sendNotfication(subject, contentClosure(it.name))
        }
    }

    private void sendNotfication(String subject, String contents) {
        // simulating external service which sends emails
        System.out.println("Sending email with subject: $subject.\nContents: $contents")
    }
}

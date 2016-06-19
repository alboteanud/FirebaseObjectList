
Firebase Object list with POJO
===================================

The POJO ("Note") has an "created" public Object that is initialised with ServerValue.TIMESTAMP and will consequently be replaces in the server with the time.
There is also a public method like

    public Long getCreatedTimestamp() {
            if (created instanceof Long) {
                return (Long) created;
            }
            else {
                return null;
            }
        }

Screenshots
-------------
<img src="screenshots/phone.png" height="400" alt="Screenshot"/>




<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.css">
    <link rel="stylesheet" href="./static/home.css">
</head>
<body>
<div class="m-container-small m-padding-tb-massive" style="max-width: 30em !important; margin-top: 100px !important;">
    <div class="ui container">
        <div class="ui middle aligned center aligned grid">
            <div class="column">
                <form class="ui large form" method="post">
                    <div class="ui segment">
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="user icon"></i>
                                <input type="text" name="username" placeholder="Username">
                            </div>
                        </div>
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="lock icon"></i>
                                <input type="password" name="password" placeholder="Password">
                            </div>
                        </div>
                        <button class="ui fluid large teal submit button">Login</button>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>

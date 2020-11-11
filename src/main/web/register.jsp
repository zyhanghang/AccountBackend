<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.css">
    <link rel="stylesheet" href="./static/home.css">
</head>
<body>
<div class="m-container-small m-padding-tb-massive" style="max-width: 30em !important; margin-top: 100px !important;">
    <div class="ui container">
        <div class="ui middle aligned center aligned grid">
            <div class="ui column">
                <form class="ui large form" method="post">
                    <div class="ui segment">
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="mail icon"></i>
                                <input type="text" name="email" placeholder="Email" id="email"
                                       value="${requestScope.email}">
                            </div>
                        </div>
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
                        <div class="field">
                            <label>Birthday</label>
                            <div class="three fields">
                                <div class="field">
                                    <select class="ui fluid search dropdown" name="card[expire-month]">
                                        <option value="">Month</option>
                                        <option value="1">January</option>
                                        <option value="2">February</option>
                                        <option value="3">March</option>
                                        <option value="4">April</option>
                                        <option value="5">May</option>
                                        <option value="6">June</option>
                                        <option value="7">July</option>
                                        <option value="8">August</option>
                                        <option value="9">September</option>
                                        <option value="10">October</option>
                                        <option value="11">November</option>
                                        <option value="12">December</option>
                                    </select>
                                </div>
                                <div class="field">
                                    <select class="ui fluid search dropdown" name="card[expire-month]">
                                        <option value="">Month</option>
                                        <option value="1">January</option>
                                        <option value="2">February</option>
                                        <option value="3">March</option>
                                        <option value="4">April</option>
                                        <option value="5">May</option>
                                        <option value="6">June</option>
                                        <option value="7">July</option>
                                        <option value="8">August</option>
                                        <option value="9">September</option>
                                        <option value="10">October</option>
                                        <option value="11">November</option>
                                        <option value="12">December</option>
                                    </select>
                                </div>
                                <div class="field">
                                    <select class="ui fluid search dropdown" name="card[expire-month]">
                                        <option value="">Month</option>
                                        <option value="1">January</option>
                                        <option value="2">February</option>
                                        <option value="3">March</option>
                                        <option value="4">April</option>
                                        <option value="5">May</option>
                                        <option value="6">June</option>
                                        <option value="7">July</option>
                                        <option value="8">August</option>
                                        <option value="9">September</option>
                                        <option value="10">October</option>
                                        <option value="11">November</option>
                                        <option value="12">December</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="field">
                            <div class="ui dropdown">
                                <input type="hidden" name="gender">
                                <i class="dropdown icon"></i>
                                <div class="default text">Gender</div>
                                <div class="menu">
                                    <div class="item" data-value="1">Male</div>
                                    <div class="item" data-value="0">Female</div>
                                </div>
                            </div>
                        </div>
                        <div class="field">
                            <select class="ui dropdown">
                                <option value="">Gender</option>
                                <option value="1">Male</option>
                                <option value="0">Female</option>
                            </select>
                        </div>
                        <button class="ui fluid large teal submit button">Register</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.2/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.js"></script>
</body>
</html>
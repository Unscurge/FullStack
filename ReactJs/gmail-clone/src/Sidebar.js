import React from "react";
import "./sidebar.css"
import { Button, IconButton } from "@mui/material";
import AddIcon from '@mui/icons-material/Add';
import Sidebaroption from "./Sidebaroption";
import InboxIcon from '@mui/icons-material/Inbox';
import StarIcon from '@mui/icons-material/Star';
import AccessTimeIcon from '@mui/icons-material/AccessTime';
import LabelImportantIcon from '@mui/icons-material/LabelImportant';
import NearMeIcon from '@mui/icons-material/NearMe';
import NoteIcon from '@mui/icons-material/Note';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import Person4Icon from '@mui/icons-material/Person4';
import DuoIcon from '@mui/icons-material/Duo';
import PhoneIcon from '@mui/icons-material/Phone';

function Sidebar() {
    return (
        <div className="sidebar">
            <Button startIcon={<AddIcon fontSize="Large" />} className="sidebar_compose" >Compose</Button>
            <Sidebaroption Icon={InboxIcon} title="Inbox" number={54} selected={true} />
            <Sidebaroption Icon={StarIcon} title="Starred" number={54} />
            <Sidebaroption Icon={AccessTimeIcon} title="Snoozed" number={54} />
            <Sidebaroption Icon={LabelImportantIcon} title="Important" number={54} />
            <Sidebaroption Icon={NearMeIcon} title="Sent" number={54} />
            <Sidebaroption Icon={NoteIcon} title="Drafts" number={54} />
            <Sidebaroption Icon={ExpandMoreIcon} title="More"/>
            <div className="sidebar_footer">
                <div className="siderbar_footericon">
                    <IconButton>
                        <Person4Icon/>
                    </IconButton>
                    <IconButton>
                        <DuoIcon/>
                    </IconButton>
                    <IconButton>
                        <PhoneIcon/>
                    </IconButton>
                </div>
            </div>
        </div>
    )
}
export default Sidebar;